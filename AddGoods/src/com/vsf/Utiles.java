package com.vsf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import com.vsf.S15.AddGoods.*;


public class Utiles {

	// Comprueba si es la primera linea
	public static boolean PrimeraLinea (int NumLinea){
		if (NumLinea==1){
			return true;
		}else {
			return false;
		}
	}

	// Devuelve la fecha de text como tipo XMLGregorianCalendar
	public static XMLGregorianCalendar FechaXML(String FechaTxt) throws DatatypeConfigurationException{
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date Fecha = null ;
		try {
			Fecha=dateFormat.parse(FechaTxt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(Fecha);
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		date2.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
		date2.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		return date2;
	}

	// Devuelve la fecha de text como tipo XMLGregorianCalendar
	public static XMLGregorianCalendar TimeXML(String FechaTxt) throws DatatypeConfigurationException{
		DateFormat timeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date Fecha = null ;
		try {
			Fecha=timeFormat.parse(FechaTxt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(Fecha);
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		date2.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
		date2.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		return date2;
	}

	// Devuelve el string como BigDecimal 
	public static BigDecimal DecimalXML(String ImporteTxt){
		BigDecimal Importe = new BigDecimal(ImporteTxt);
		return Importe;
	}

	// Devuelve el string como BigInteger
	public static BigInteger IntXML(String ImporteTxt){
		BigInteger Valor = new BigInteger(ImporteTxt);
		return Valor;
	}

	// Comprueba si es un servicio
	public static boolean EsServicio(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("S")){
			return true;
		} else{
			return false;
		}
	}

	// Comprueba si es un dispositivo
	public static boolean EsDispositivo(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("D")){
			return true;
		} else{
			return false;
		}
	}

	// Comprueba si es un coste
	public static boolean EsCoste(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("C")){
			return true;
		} else{
			return false;
		}
	}

	// Comprueba si es una Fee
	public static boolean EsFee(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("F")){
			return true;
		} else{
			return false;
		}
	}

	// Comprueba si es Fund
	public static boolean EsFund(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("T")){
			return true;
		} else{
			return false;
		}
	}

	// Genera el fichero xml
	public static void GeneraAddGoods ( AddGoodsServices s15AddGoodsServices, String ficheroSalidaXML, String log_file) throws JAXBException, IOException{
		File ficheroXML= new File(ficheroSalidaXML);
		System.out.println("   Extracting file " + ficheroSalidaXML);
		JAXBContext contexto = JAXBContext.newInstance(s15AddGoodsServices.getClass() );
		Marshaller marshaller = contexto.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
				Boolean.TRUE);
		marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, 
				"http://ifrs15.vodafone.com/events/addgoodsservices_v3 addgoodsservices_v3.xsd");
		marshaller.marshal(s15AddGoodsServices,ficheroXML);	
		try {
			String schemaLang = "http://www.w3.org/2001/XMLSchema";
			SchemaFactory factory = SchemaFactory.newInstance(schemaLang);
			JAXBSource source = new JAXBSource(contexto, s15AddGoodsServices);
			Schema schema = factory.newSchema(new File("src\\xsd_v3\\addgoodsservices_v3.xsd"));
			Validator validator = schema.newValidator();
			validator.validate(source);
		} catch (SAXException e) {
			writeFile(log_file, "Error while validating file "+ficheroSalidaXML+" :" + e.getCause() + "\n");
			//System.out.println(" sax exception :" + e.getCause());
		} catch (Exception ex) {
			writeFile(log_file, "excep :" + ex.getMessage());
		}
	}

	// Comprueba si es el mismo contrato
	public static boolean CambioContrato(String ContractA, String ContractB){
		if (ContractA.trim().equals(ContractB.trim()))
		{
			return true;
		} else {
			return false;
		}
	}

	// Añade atributos de contrato
	public static void addContractAtrib(AddGoodsServicesType Contrato, 
			String f_eventType, String f_eventDate, String f_eventContractID, 
			String f_companyCode, String f_catchUpIndicator, String f_billingType,
			String f_currency ) throws DatatypeConfigurationException{

		if (f_eventType.length()!=0) Contrato.setEventType(f_eventType);
		if (f_eventDate.length()!=0) Contrato.setEventDate(FechaXML(f_eventDate));
		if (f_eventContractID.length()!=0) Contrato.setEventContractID(f_eventContractID);
		if (f_companyCode.length()!=0) Contrato.setCompanyCode(f_companyCode);
		if (f_catchUpIndicator.length()!=0) Contrato.setCatchUpIndicator(f_catchUpIndicator);
		if (f_billingType.length()!=0) Contrato.setBillingType(f_billingType);
		if (f_currency.length()!=0) Contrato.setCurrency(CurrencyType.fromValue(f_currency));

	}

	// Añade atributos de Servicios
	public static void addServiceAtrib(ServiceComplexType Servicio, 
			String f_POB_CD_POB, String f_POB_ID_Unico, 
			String f_POB_serviceTimeUnit,
			String f_POB_activatedServices,
			String f_POB_transferDate,
			String f_POB_StartDate,
			String f_POB_EndDate,
			String f_POB_ssp,
			String f_POB_serviceEndDateEstimated,
			String f_POB_maxRolloverPeriod,
			String f_POB_discountIndicator,
			String f_POB_quantity,
			String f_POB_companyCode,
			String f_POB_firstPlanBillingDate	,
			String f_POB_profitCenter			,
			String f_POB_excludeFromAllocation  ,
			String f_POB_referenceAccount		,
			String f_POB_pobName				,
			String f_POB_billingType			,
			String f_POB_indirectChannel		,
			String f_POB_serviceType			
			) throws DatatypeConfigurationException{

		if (f_POB_CD_POB.length()!=0) Servicio.setServiceCode(f_POB_CD_POB);
		if (f_POB_ID_Unico.length()!=0) Servicio.setServiceID(f_POB_ID_Unico);
		if (f_POB_serviceTimeUnit.length()!=0) Servicio.setServiceTimeUnit(f_POB_serviceTimeUnit);
		if (f_POB_activatedServices.length()!=0) Servicio.setActivatedServices(IntXML(f_POB_activatedServices));
		if (f_POB_transferDate.length()!=0) Servicio.setServiceTransferDate(FechaXML(f_POB_transferDate));
		if (f_POB_StartDate.length()!=0) Servicio.setServiceStartDate(FechaXML(f_POB_StartDate));
		if (f_POB_EndDate.length()!=0) Servicio.setServiceEndDate(FechaXML(f_POB_EndDate));
		if (f_POB_ssp.length()!=0) Servicio.setSSP(DecimalXML(f_POB_ssp));
		if (f_POB_serviceEndDateEstimated.length()!=0) Servicio.setServiceEndDateEstimated(FechaXML(f_POB_serviceEndDateEstimated));
		if (f_POB_maxRolloverPeriod.length()!=0) Servicio.setMaxRolloverPeriod(IntXML(f_POB_maxRolloverPeriod));
		if (f_POB_discountIndicator.length()!=0) Servicio.setDiscountIndicator(f_POB_discountIndicator);
		if (f_POB_quantity.length()!=0) Servicio.setServiceQuantity(IntXML(f_POB_quantity));
		if (f_POB_companyCode.length()!=0) Servicio.setCompanyCode(f_POB_companyCode);
		if (f_POB_firstPlanBillingDate.length()!=0) Servicio.setFirstPlanBillingDate(FechaXML(f_POB_firstPlanBillingDate));
		if (f_POB_profitCenter.length()!=0) Servicio.setProfitCenter(f_POB_profitCenter);
		if (f_POB_excludeFromAllocation.length()!=0) Servicio.setExcludeFromAllocation(f_POB_excludeFromAllocation);
		if (f_POB_referenceAccount.length()!=0) Servicio.setReferenceAccount(f_POB_referenceAccount);
		if (f_POB_pobName.length()!=0) Servicio.setPOBName(f_POB_pobName);
		if (f_POB_billingType.length()!=0) Servicio.setBillingType(f_POB_billingType);
		if (f_POB_indirectChannel.length()!=0) Servicio.setIndirectChannelTariffEqualisationFactor(DecimalXML(f_POB_indirectChannel));
		if (f_POB_serviceType.length()!=0) Servicio.setServiceType(f_POB_serviceType);
	}

	// Añade atributos de dispositivos
	public static void addDeviceAtrib(DeviceComplexType Device, 
			String f_POB_CD_POB, String f_POB_ID_Unico, 
			String f_POB_serviceTimeUnit,
			String f_POB_transferDate,
			String f_POB_StartDate,
			String f_POB_EndDate,
			String f_POB_ssp,
			String f_POB_financingDiscountRate,
			String f_POB_discountIndicator		,
			String f_POB_quantity				,
			String f_POB_companyCode			,
			String f_POB_firstPlanBillingDate	,
			String f_POB_profitCenter			,
			String f_POB_excludeFromAllocation  ,
			String f_POB_referenceAccount		,
			String f_POB_pobName				,
			String f_POB_billingType			
			) throws DatatypeConfigurationException{

		if (f_POB_CD_POB.length()!=0) Device.setDeviceCode(f_POB_CD_POB);
		if (f_POB_ID_Unico.length()!=0) Device.setDeviceID(f_POB_ID_Unico);
		if (f_POB_serviceTimeUnit.length()!=0) Device.setDeviceTimeUnit(f_POB_serviceTimeUnit);
		if (f_POB_transferDate.length()!=0) Device.setDeviceTransferDate(FechaXML(f_POB_transferDate));
		if (f_POB_StartDate.length()!=0) Device.setDeviceStartDate(FechaXML(f_POB_StartDate));
		if (f_POB_EndDate.length()!=0) Device.setDeviceEndDate(FechaXML(f_POB_EndDate));
		if (f_POB_ssp.length()!=0) Device.setSSP(DecimalXML(f_POB_ssp));
		if (f_POB_financingDiscountRate.length()!=0) Device.setFinancingDiscountRate(DecimalXML(f_POB_financingDiscountRate));
		if (f_POB_discountIndicator.length()!=0) Device.setDiscountIndicator(f_POB_discountIndicator);
		if (f_POB_quantity.length()!=0) Device.setDeviceQuantity(IntXML(f_POB_quantity));
		if (f_POB_companyCode.length()!=0) Device.setCompanyCode(f_POB_companyCode);
		if (f_POB_companyCode.length()!=0) Device.setFirstPlanBillingDate(FechaXML(f_POB_firstPlanBillingDate));
		if (f_POB_profitCenter.length()!=0) Device.setProfitCenter(f_POB_profitCenter);
		if (f_POB_excludeFromAllocation.length()!=0) Device.setExcludeFromAllocation(f_POB_excludeFromAllocation);
		if (f_POB_referenceAccount.length()!=0) Device.setReferenceAccount(f_POB_referenceAccount);
		if (f_POB_pobName.length()!=0) Device.setPOBName(f_POB_pobName);
		if (f_POB_billingType.length()!=0) Device.setBillingType(f_POB_billingType);		
	}

	// Añade atributos de COPA de servicios
	public static void AddPobCOPAServ(ServiceComplexType Servicio, MIAttributesComplexType COPAService,
			String f_POB_COPA_customerType,		
			String f_POB_COPA_callOriginDestination,
			String f_POB_COPA_channel,					
			String f_POB_COPA_segment,					
			String f_POB_COPA_bearerTechnology,		
			String f_POB_COPA_valueTier,				
			String f_POB_COPA_proposition,				
			String f_POB_COPA_deviceTechnology,		
			String f_POB_COPA_customer,				
			String f_POB_COPA_spare1,					
			String f_POB_COPA_spare2,					
			String f_POB_COPA_brand,					
			String f_POB_COPA_documentType,			
			String f_POB_COPA_tradingPartner,			
			String f_POB_COPA_batch,					
			String f_POB_COPA_valuationType,			
			String f_POB_COPA_functionalArea,			
			String f_POB_COPA_orderNumber,				
			String f_POB_COPA_salesOffice,				
			String f_POB_COPA_salesOrg){

		if (f_POB_COPA_customerType.length()!=0) COPAService.setCustomerType(f_POB_COPA_customerType);
		if (f_POB_COPA_callOriginDestination.length()!=0) COPAService.setCallOriginDestination(f_POB_COPA_callOriginDestination);
		if (f_POB_COPA_channel.length()!=0) COPAService.setChannel(f_POB_COPA_channel);
		if (f_POB_COPA_segment.length()!=0) COPAService.setSegment(f_POB_COPA_segment);
		if (f_POB_COPA_bearerTechnology.length()!=0) COPAService.setBearerTechnology(f_POB_COPA_bearerTechnology);
		if (f_POB_COPA_valueTier.length()!=0) COPAService.setValueTier(f_POB_COPA_valueTier);
		if (f_POB_COPA_proposition.length()!=0) COPAService.setProposition(f_POB_COPA_proposition);
		if (f_POB_COPA_deviceTechnology.length()!=0) COPAService.setDeviceTechnology(f_POB_COPA_deviceTechnology);
		if (f_POB_COPA_customer.length()!=0) COPAService.setCustomer(f_POB_COPA_customer);
		if (f_POB_COPA_spare1.length()!=0) COPAService.setSpare1(f_POB_COPA_spare1);
		if (f_POB_COPA_spare2.length()!=0) COPAService.setSpare2(f_POB_COPA_spare2);
		if (f_POB_COPA_brand.length()!=0) COPAService.setBrand(f_POB_COPA_brand);
		if (f_POB_COPA_documentType.length()!=0) COPAService.setDocumentType(f_POB_COPA_documentType);
		if (f_POB_COPA_tradingPartner.length()!=0) COPAService.setTradingPartner(f_POB_COPA_tradingPartner);
		if (f_POB_COPA_batch.length()!=0) COPAService.setBatch(f_POB_COPA_batch);
		if (f_POB_COPA_valuationType.length()!=0) COPAService.setValuationType(f_POB_COPA_valuationType);
		if (f_POB_COPA_functionalArea.length()!=0) COPAService.setFunctionalArea(f_POB_COPA_functionalArea);
		if (f_POB_COPA_orderNumber.length()!=0) COPAService.setOrderNumber(f_POB_COPA_orderNumber);
		if (f_POB_COPA_salesOffice.length()!=0) COPAService.setSalesOffice(f_POB_COPA_salesOffice);
		if (f_POB_COPA_salesOrg.length()!=0) COPAService.setSalesOrg(f_POB_COPA_salesOrg);
		Servicio.setMIAttributes(COPAService);
	}

	// Añade atributos de COPA de dispositivos
	public static void AddPobCOPADev(DeviceComplexType Device, MIAttributesComplexType COPADevice,
			String f_POB_COPA_customerType,		
			String f_POB_COPA_callOriginDestination,
			String f_POB_COPA_channel,					
			String f_POB_COPA_segment,					
			String f_POB_COPA_bearerTechnology,		
			String f_POB_COPA_valueTier,				
			String f_POB_COPA_proposition,				
			String f_POB_COPA_deviceTechnology,		
			String f_POB_COPA_customer,				
			String f_POB_COPA_spare1,					
			String f_POB_COPA_spare2,					
			String f_POB_COPA_brand,					
			String f_POB_COPA_documentType,			
			String f_POB_COPA_tradingPartner,			
			String f_POB_COPA_batch,					
			String f_POB_COPA_valuationType,			
			String f_POB_COPA_functionalArea,			
			String f_POB_COPA_orderNumber,				
			String f_POB_COPA_salesOffice,				
			String f_POB_COPA_salesOrg){

		if (f_POB_COPA_customerType.length()!=0) COPADevice.setCustomerType(f_POB_COPA_customerType);
		if (f_POB_COPA_callOriginDestination.length()!=0) COPADevice.setCallOriginDestination(f_POB_COPA_callOriginDestination);
		if (f_POB_COPA_channel.length()!=0) COPADevice.setChannel(f_POB_COPA_channel);
		if (f_POB_COPA_segment.length()!=0) COPADevice.setSegment(f_POB_COPA_segment);
		if (f_POB_COPA_bearerTechnology.length()!=0) COPADevice.setBearerTechnology(f_POB_COPA_bearerTechnology);
		if (f_POB_COPA_valueTier.length()!=0) COPADevice.setValueTier(f_POB_COPA_valueTier);
		if (f_POB_COPA_proposition.length()!=0) COPADevice.setProposition(f_POB_COPA_proposition);
		if (f_POB_COPA_deviceTechnology.length()!=0) COPADevice.setDeviceTechnology(f_POB_COPA_deviceTechnology);
		if (f_POB_COPA_customer.length()!=0) COPADevice.setCustomer(f_POB_COPA_customer);
		if (f_POB_COPA_spare1.length()!=0) COPADevice.setSpare1(f_POB_COPA_spare1);
		if (f_POB_COPA_spare2.length()!=0) COPADevice.setSpare2(f_POB_COPA_spare2);
		if (f_POB_COPA_brand.length()!=0) COPADevice.setBrand(f_POB_COPA_brand);
		if (f_POB_COPA_documentType.length()!=0) COPADevice.setDocumentType(f_POB_COPA_documentType);
		if (f_POB_COPA_tradingPartner.length()!=0) COPADevice.setTradingPartner(f_POB_COPA_tradingPartner);
		if (f_POB_COPA_batch.length()!=0) COPADevice.setBatch(f_POB_COPA_batch);
		if (f_POB_COPA_valuationType.length()!=0) COPADevice.setValuationType(f_POB_COPA_valuationType);
		if (f_POB_COPA_functionalArea.length()!=0) COPADevice.setFunctionalArea(f_POB_COPA_functionalArea);
		if (f_POB_COPA_orderNumber.length()!=0) COPADevice.setOrderNumber(f_POB_COPA_orderNumber);
		if (f_POB_COPA_salesOffice.length()!=0) COPADevice.setSalesOffice(f_POB_COPA_salesOffice);
		if (f_POB_COPA_salesOrg.length()!=0) COPADevice.setSalesOrg(f_POB_COPA_salesOrg);
		Device.setMIAttributes(COPADevice);
	}

	// Añade atributos de Fund
	public static void addFundAtrib(FundComplexType fund, String f_Fund_ID, String f_Fund_Start_Date, String f_Fund_End_Date,
			String f_Fund_Type, String f_Fund_Amount, String f_Fund_Amount_Utilized, String f_Fund_Profit_Center, 
			String f_Fund_Reference_Account, String f_Fund_POB_Name) throws DatatypeConfigurationException {
		// TODO Auto-generated method stub

		if (f_Fund_ID.length()!=0) fund.setFundID(f_Fund_ID);
		if (f_Fund_Start_Date.length()!=0) fund.setFundStartDate(FechaXML(f_Fund_Start_Date));
		if (f_Fund_End_Date.length()!=0) fund.setFundEndDate(FechaXML(f_Fund_End_Date));
		if (f_Fund_Type.length()!=0) fund.setFundType(f_Fund_Type);
		if (f_Fund_Amount.length()!=0) fund.setFundAmount(DecimalXML(f_Fund_Amount));
		if (f_Fund_Amount_Utilized.length()!=0) fund.setAmountOfTechFundUtilisedByCustomerExpected(DecimalXML(f_Fund_Amount_Utilized));
		if (f_Fund_Profit_Center.length()!=0) fund.setProfitCenter(f_Fund_Profit_Center);
		if (f_Fund_Reference_Account.length()!=0) fund.setReferenceAccount(f_Fund_Reference_Account);
		if (f_Fund_POB_Name.length()!=0) fund.setPOBName(f_Fund_POB_Name);

	}

	// Escribe hora en el fichero de control
	public static void EscribeHoraFileControl(String ficheroSalidaXML, long TiempoInicial){
		BufferedWriter out = null;
		try {
			out=new BufferedWriter(new FileWriter(ficheroSalidaXML+"Control_Ejecucion.txt", true));
			out.write("#### Comienzo: " +String.valueOf(TiempoInicial)+"\r\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out !=null){
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// Resta fechas
	public static long RestaFechas (long TiempoInicial, long TiempoFinal ){
		long Resta;
		Resta=TiempoFinal-TiempoInicial;
		return Resta;
	}

	// Estima tiempo restante
	public static String EstimaTimepoRestante(long TotalRegistros, int IncLineas, long msecsInc, int TotalLineas, long msecsTotal){
		String Texto="";
		if ((msecsInc!=0 )&&(IncLineas!=0)&&(msecsTotal!=0)&&(TotalLineas!=0)&&(TotalRegistros!=0))
		{
			if (msecsInc<0.0000001){
				msecsInc=(long) 0.0000001;
			}
			double mseclinea=IncLineas/msecsInc;
			double Totalsecs=TotalRegistros/mseclinea/1000;
			int Totalmins=(int) (Totalsecs/60);
			int TotalHoras=Totalmins/60;
			Texto="     ->Estim. Final: "+String.valueOf(Totalmins);
		}
		return Texto;
	}

	// Añade al fichero de control
	public static void AppendFicheroControl (int Fichero, String Ruta, int Sufijo, int Lineas,int Contratos, int Pobs,
			int IncLineas, int IncContratos, int IncPobs, long Tiempo, long msecTranscurridos,
			String Estimado){

		BufferedWriter out = null;
		try {
			out=new BufferedWriter(new FileWriter(Ruta+"Control_Ejecucion.txt", true));
			out.write("File: " +String.valueOf(Fichero));
			out.write(" -Lin: " + String.valueOf(Lineas) +"(+"+String.valueOf(IncLineas)+") ");
			out.write(" -Cont: " +String.valueOf(Contratos) +"(+"+String.valueOf(IncContratos)+")");
			out.write(" -Pobs: " +String.valueOf(Pobs) +"(+"+String.valueOf(IncPobs)+") ");
			out.write(" # (msecs): " +String.valueOf(Tiempo) );
			out.write(" # Transcurrido: " +String.valueOf(msecTranscurridos)+" msecs - "+String.valueOf(msecTranscurridos/(1000*60))+" mins" );
			out.write(Estimado +"\r\n" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out !=null){
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}

	// Añade atributos de coste
	public static void addCostAtrib(CostComplexType Coste, String f_costCompanyCode, String f_costTransferDate) throws DatatypeConfigurationException {
		Coste.setCompanyCode(f_costCompanyCode);
		Coste.setCostTransferDate(FechaXML(f_costTransferDate));
	}

	// Añade atributos a Cost POB Level 
	public static void addPOBLvlAtrib(POBLevelComplexType pOBlvlElement, String f_cost_POBID) {
		pOBlvlElement.setServiceIDDeviceID(f_cost_POBID);
	}

	// Añade atributos de Cost Amount
	public static void addCostAmountAtrib(AmountComplexType amountElement, BigDecimal importe, String f_costType, String f_costRefAccount) {
		// TODO Auto-generated method stub
		amountElement.setCostAmount(importe);
		amountElement.setCostType(f_costType);
		amountElement.setReferenceAccount(f_costRefAccount);
	}

	// Añade atributos a Fee
	public static void addFeeAtrib(FeeComplexType feeElement, String f_FEE_ID, String f_FEE_Type, BigDecimal F_FEE_Amount, String f_FEE_ProfitCenter,
			String f_FEE_RefAccount, String f_FEE_POBName) {
		// TODO Auto-generated method stub
		feeElement.setFeeID(f_FEE_ID);
		feeElement.setFeeType(f_FEE_Type);
		feeElement.setFeeAmount(F_FEE_Amount);
		feeElement.setProfitCenter(f_FEE_ProfitCenter);
		feeElement.setReferenceAccount(f_FEE_RefAccount);
		feeElement.setPOBName(f_FEE_POBName);
	}

	// Añade atributos a la cabecera
	public static void AddHeaderAttrib(FileHeaderComplexType fileHeader, String consumerType, String countryCode, String eventType,
			Date currentDate, Calendar cal, long l, String sourceEvent, String sourceOpCo) throws DatatypeConfigurationException {
		// TODO Auto-generated method stub

		// consumer_<country_code>_inception_yyyymmdd_<sequence number>.xml
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		DateFormat timeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String filename=consumerType+"_"+countryCode+"_"+eventType+"_"+dateFormat.format(currentDate)+"_"+l+".xml";

		BigInteger seqNumber = BigInteger.valueOf(l);

		fileHeader.setFileName(filename);
		fileHeader.setCreatedAt(Utiles.TimeXML(timeFormat.format(cal.getTime())));
		fileHeader.setFileSequenceID(seqNumber);
		fileHeader.setSourceEvent(sourceEvent);
		fileHeader.setSourceOpco(sourceOpCo);

	}

	// Escribe una linea en un fichero
	public static void writeFile(String filename, String line) throws IOException {
		// TODO Auto-generated method stub
		line = line.replace(";null",";");
		FileWriter fw = new FileWriter(filename,true); //the true will append the new data
		fw.write(line);//appends the string to the file
		fw.close();	
	}

	// Obtiene un hashmap con los números de secuencia
	public static HashMap<String, Integer> getSeqID (String seq_file) throws NumberFormatException, IOException{

		String linea_seq;
		String[]Campos_seq;
		HashMap<String, Integer> SeqIDs = new HashMap<String, Integer>();
		try {
			BufferedReader reader =	new BufferedReader(new	FileReader(seq_file));
			while((linea_seq = reader.readLine())!=null) {
				Campos_seq = linea_seq.split(";"); // Deconstruyo el registro en campos
				SeqIDs.put(Campos_seq[0], new Integer(Campos_seq[1]));
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File "+seq_file+" not found.");
			//e.printStackTrace();		
		}
		return SeqIDs;
	}

	// Crea el fichero TWU15Y12.sql en el que escribe la actualización de los números de secuencia
	public static void updateSeqID(String filename, HashMap<String, Integer> oldSeqs, HashMap<String, Integer> newSeqs) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter(filename,false); //the true will append the new data
		String header = "/* *************************************************************************************** */\r\n" + 
				"/* [SCRIPT_NAME]     :TWU15Y12.sql                                                         */\r\n" + 
				"/* [CREATOR]         :TERADATA                                                             */\r\n" + 
				"/* [CREATED_DATE]    :20170516                                                             */\r\n" + 
				"/* [CHANGED DATE]    :                                                                     */\r\n" + 
				"/* [DESCRIPTIOND]    :Actualización de IDs de secuencia en la tabla S15_X_SEQUENCEID       */\r\n" + 
				"/* *************************************************************************************** */\r\n" + 
				"\r\n" + 
				".SIDETITLES\r\n" + 
				".REMARK '################################################################################'\r\n" + 
				".REMARK '#            ACTUALIZACION DE LA TABLA S15_X_SEQUENCEID                        #'\r\n" + 
				".REMARK '################################################################################'\r\n" + 
				"  \r\n" + 
				"  ";

		String footer = ".IF ERRORCODE= 0  THEN .GOTO CONTINUAR_2\r\n" + 
				".REMARK '################################################################################'\r\n" + 
				".REMARK '#       ERROR EN LA ACTUALIZACION DE LA TABLA S15_X_SEQUENCEID                 #'\r\n" + 
				".REMARK '################################################################################'\r\n" + 
				".QUIT ${ERROR_INSERT}\r\n" + 
				"\r\n" + 
				".LABEL CONTINUAR_2\r\n" + 
				"\r\n" + 
				".REMARK '################################################################################'\r\n" + 
				".REMARK '# PROCESO TWU15Y12 FINALIZADO CORRECTAMENTE                                    #'\r\n" + 
				".REMARK '################################################################################'\r\n" + 
				"\r\n" + 
				".QUIT ${OK}\r\n" + 
				"\r\n" + 
				"/*==============================================================*/\r\n" + 
				"/* End job                                                      */\r\n" + 
				"/*==============================================================*/\r\n" + 
				"  \r\n" + 
				"";

		fw.write(header);

		Date FechaActual=new Date();
		String modifiedDate= new SimpleDateFormat("yyyyMMdd").format(FechaActual);
		java.util.Iterator<Entry<String, Integer>> itOldSeqs = oldSeqs.entrySet().iterator();
		while (itOldSeqs.hasNext()) {
			String key = itOldSeqs.next().getKey();

			if (!oldSeqs.get(key).equals(newSeqs.get(key))){
				String update="UPDATE ${DBDWH}.S15_X_SEQUENCEID SET ESTADO_REGISTRO='M', FX_FIN_VIGENCIA='"+modifiedDate+
						"' WHERE VARNAME='"+key+"' AND FX_FIN_VIGENCIA='35000101' ;\r\n" ;
				String insert="INSERT INTO ${DBDWH}.S15_X_SEQUENCEID (VARNAME, VARVALUE, "
						+ "FX_INICIO_VIGENCIA, FX_FIN_VIGENCIA, ESTADO_REGISTRO, FX_CARGA)\r\n"
						+ "	VALUES	('"+key+"', '"+ newSeqs.get(key).toString() +"' , '" + modifiedDate+ "', '35000101', 'A', '"
						+ modifiedDate +"');\r\n\r\n" ;
				fw.write(update);
				fw.write(insert);
			}
		}
		fw.write(footer);
		fw.close();	
	}

}
