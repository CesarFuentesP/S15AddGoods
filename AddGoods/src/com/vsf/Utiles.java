package com.vsf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import com.vsf.S15.AddGoods.*;

public class Utiles {

	
	public static boolean PrimeraLinea (int NumLinea){
		if (NumLinea==1){
				return true;
			}else {
				return false;
			}
	}
	
	
	// Devuelve la fecha de text como tipo XMLGregorianCalendar
	public static XMLGregorianCalendar FechaXML(String FechaTxt) throws DatatypeConfigurationException{
		DateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
		Date Fecha = null ;
		// Temporal
		//if (FechaTxt.equals("")){
		//	FechaTxt="17540303";
		//}
		//
		try {
			Fecha=dateFormat.parse(FechaTxt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(Fecha);
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		return date2;
	}
	
	public static BigDecimal DecimalXML(String ImporteTxt){
	// Temporal
	//	if (ImporteTxt.equals("")){
	//		ImporteTxt="0";
	//	}
	//
		BigDecimal Importe = new BigDecimal(ImporteTxt);
		return Importe;
	}

	public static BigInteger IntXML(String ImporteTxt){
		BigInteger Valor = new BigInteger(ImporteTxt);
		return Valor;
	}
	
	// Comprueba si es un servicio o un dispositivo
	public static boolean EsServicio(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("S")){
			return true;
		} else{
		return false;
		}
	}
	// Comprueba si es un servicio o un dispositivo
	public static boolean EsDispositivo(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("D")){
			return true;
		} else{
		return false;
		}
	}

	// Comprueba si es un servicio, un dispositivo, coste o fee
	public static boolean EsCoste(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("C")){
			return true;
		} else{
		return false;
		}
	}
	
	// Comprueba si es un servicio, un dispositivo, coste o fee
	public static boolean EsFee(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("F")){
			return true;
		} else{
		return false;
		}
	}
	
	
	public static void Genera ( AddGoodsServices s15AddGoodsServices, String ficheroSalidaXML, int numfichero) throws JAXBException{
		
		String sufijofileXML=String.valueOf(numfichero);
		String XMLFile=ficheroSalidaXML+"_"+sufijofileXML+".xml";
		File ficheroXML= new File(XMLFile);
		JAXBContext contexto = JAXBContext.newInstance(s15AddGoodsServices.getClass() );
		Marshaller marshaller = contexto.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
          Boolean.TRUE);
		marshaller.marshal(s15AddGoodsServices,ficheroXML);	
	}
	
	public static boolean CambioContrato(String ContractA, String ContractB){
		if (ContractA.trim().equals(ContractB.trim()))
		{
			return true;
		} else {
			return false;
		}
	}

//	public static  InceptionComplexType NuevoInception(InceptionComplexType ObjInception) throws DatatypeConfigurationException{
//		
//		return ObjInception;
//		
//	}
	
	
//	public static  InceptionComplexType NuevoInception(InceptionComplexType ObjInception,
//			String eventType, 
//			String eventDate, 
//			String eventContractID,
//			String companyCode) throws DatatypeConfigurationException{
//ObjInception.setEventType(eventType);
//ObjInception.setEventDate(Utiles.FechaXML(eventDate));
//ObjInception.setEventContractID(eventContractID);
//ObjInception.setCompanyCode(companyCode);

//return ObjInception;

//}

	
	public static void addContractAtrib(AddGoodsServicesType Contrato, 
			String f_eventType, String f_eventDate, String f_eventContractID, 
			String f_companyCode, String f_catchUpIndicator, String f_billingType,
			String f_currency ) throws DatatypeConfigurationException{

		Contrato.setEventType(f_eventType);
		Contrato.setEventDate(FechaXML(f_eventDate));
		Contrato.setEventContractID(f_eventContractID);
		Contrato.setCompanyCode(f_companyCode);
		Contrato.setCatchUpIndicator(f_catchUpIndicator);
		Contrato.setBillingType(f_billingType);
		Contrato.setCurrency(CurrencyType.fromValue(f_currency));
		
	}

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
		
		Servicio.setServiceCode(f_POB_CD_POB);
		Servicio.setServiceID(f_POB_ID_Unico);
		Servicio.setServiceTimeUnit(f_POB_serviceTimeUnit);
		Servicio.setActivatedServices(IntXML(f_POB_activatedServices));
		Servicio.setServiceTransferDate(FechaXML(f_POB_transferDate));
		Servicio.setServiceStartDate(FechaXML(f_POB_StartDate));
		Servicio.setServiceEndDate(FechaXML(f_POB_EndDate));
		Servicio.setSSP(DecimalXML(f_POB_ssp));
		// Falta por incluir One-off
		Servicio.setServiceEndDateEstimated(FechaXML(f_POB_serviceEndDateEstimated));
		Servicio.setMaxRolloverPeriod(IntXML(f_POB_maxRolloverPeriod));
		Servicio.setDiscountIndicator(f_POB_discountIndicator);
		Servicio.setServiceQuantity(IntXML(f_POB_quantity));
		Servicio.setCompanyCode(f_POB_companyCode);
		Servicio.setFirstPlanBillingDate(FechaXML(f_POB_firstPlanBillingDate));
		Servicio.setProfitCenter(f_POB_profitCenter);
		Servicio.setExcludeFromAllocation(f_POB_excludeFromAllocation);
		Servicio.setReferenceAccount(f_POB_referenceAccount);
		Servicio.setPOBName(f_POB_pobName);
		Servicio.setBillingType(f_POB_billingType);
		Servicio.setIndirectChannelTariffEqualisationFactor(DecimalXML(f_POB_indirectChannel));
		Servicio.setServiceType(f_POB_serviceType);
		
		
	}

	public static void addDeviceAtrib(DeviceComplexType Device, 
			String f_POB_CD_POB, String f_POB_ID_Unico, 
			String f_POB_serviceTimeUnit,
		//	String f_POB_activatedServices,
			String f_POB_transferDate,
			String f_POB_StartDate,
			String f_POB_EndDate,
			String f_POB_ssp,
			String f_POB_financingDiscountRate,
			String f_POB_discountIndicator		,
			String f_POB_quantity				,
		//	String f_POB_avgDiscountFactor		,
			String f_POB_companyCode			,
			String f_POB_firstPlanBillingDate	,
		    String f_POB_profitCenter			,
		    String f_POB_excludeFromAllocation  ,
		    String f_POB_referenceAccount		,
		    String f_POB_pobName				,
		    String f_POB_billingType			
			) throws DatatypeConfigurationException{
		
		
		Device.setDeviceCode(f_POB_CD_POB);
		Device.setDeviceID(f_POB_ID_Unico);
		Device.setDeviceTimeUnit(f_POB_serviceTimeUnit);
		Device.setDeviceTransferDate(FechaXML(f_POB_transferDate));
		Device.setDeviceStartDate(FechaXML(f_POB_StartDate));
		Device.setDeviceEndDate(FechaXML(f_POB_EndDate));
		Device.setSSP(DecimalXML(f_POB_ssp));
		// Falta por incluir One-off
		Device.setFinancingDiscountRate(DecimalXML(f_POB_financingDiscountRate));
		Device.setDiscountIndicator(f_POB_discountIndicator);
		Device.setDeviceQuantity(IntXML(f_POB_quantity));
		//Device.setAverageDiscountFactor(DecimalXML(f_POB_avgDiscountFactor));
		Device.setCompanyCode(f_POB_companyCode);
		Device.setFirstPlanBillingDate(FechaXML(f_POB_firstPlanBillingDate));
		Device.setProfitCenter(f_POB_profitCenter);
		Device.setExcludeFromAllocation(f_POB_excludeFromAllocation);
		Device.setReferenceAccount(f_POB_referenceAccount);
		Device.setPOBName(f_POB_pobName);
		Device.setBillingType(f_POB_billingType);		
		
	}
	
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
	
	COPAService.setCustomerType(f_POB_COPA_customerType);
	COPAService.setCallOriginDestination(f_POB_COPA_callOriginDestination);
	COPAService.setChannel(f_POB_COPA_channel);
	COPAService.setSegment(f_POB_COPA_segment);
	COPAService.setBearerTechnology(f_POB_COPA_bearerTechnology);
	COPAService.setValueTier(f_POB_COPA_valueTier);
	COPAService.setProposition(f_POB_COPA_proposition);
	COPAService.setDeviceTechnology(f_POB_COPA_deviceTechnology);
	COPAService.setCustomer(f_POB_COPA_customer);
	COPAService.setSpare1(f_POB_COPA_spare1);
	COPAService.setSpare2(f_POB_COPA_spare2);
	COPAService.setBrand(f_POB_COPA_brand);
	COPAService.setDocumentType(f_POB_COPA_documentType);
	COPAService.setTradingPartner(f_POB_COPA_tradingPartner);
	COPAService.setBatch(f_POB_COPA_batch);
	COPAService.setValuationType(f_POB_COPA_valuationType);
	COPAService.setFunctionalArea(f_POB_COPA_functionalArea);
	COPAService.setOrderNumber(f_POB_COPA_orderNumber);
	COPAService.setSalesOffice(f_POB_COPA_salesOffice);
	COPAService.setSalesOrg(f_POB_COPA_salesOrg);
	
	Servicio.setMIAttributes(COPAService);

}



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
	
	COPADevice.setCustomerType(f_POB_COPA_customerType);
	COPADevice.setCallOriginDestination(f_POB_COPA_callOriginDestination);
	COPADevice.setChannel(f_POB_COPA_channel);
	COPADevice.setSegment(f_POB_COPA_segment);
	COPADevice.setBearerTechnology(f_POB_COPA_bearerTechnology);
	COPADevice.setValueTier(f_POB_COPA_valueTier);
	COPADevice.setProposition(f_POB_COPA_proposition);
	COPADevice.setDeviceTechnology(f_POB_COPA_deviceTechnology);
	COPADevice.setCustomer(f_POB_COPA_customer);
	COPADevice.setSpare1(f_POB_COPA_spare1);
	COPADevice.setSpare2(f_POB_COPA_spare2);
	COPADevice.setBrand(f_POB_COPA_brand);
	COPADevice.setDocumentType(f_POB_COPA_documentType);
	COPADevice.setTradingPartner(f_POB_COPA_tradingPartner);
	COPADevice.setBatch(f_POB_COPA_batch);
	COPADevice.setValuationType(f_POB_COPA_valuationType);
	COPADevice.setFunctionalArea(f_POB_COPA_functionalArea);
	COPADevice.setOrderNumber(f_POB_COPA_orderNumber);
	COPADevice.setSalesOffice(f_POB_COPA_salesOffice);
	COPADevice.setSalesOrg(f_POB_COPA_salesOrg);
	
	Device.setMIAttributes(COPADevice);

}

public static void AddAttribCost(CostListComplexType CostList, CostComplexType CostElement, POBLevelListComplexType PobLvlList,
		POBLevelComplexType POBlvlElement, AmountListComplexType AmntList, AmountComplexType CostAmount){
	
	
	
	
	
}

public static void EscribeHoraFileControl(String ficheroSalidaXML, long TiempoInicial){
	BufferedWriter out = null;
	try {
	//	out=new BufferedWriter(new FileWriter(Ruta+"Control_"+String.valueOf(Sufijo)+".txt", true));
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

public static long RestaFechas (long TiempoInicial, long TiempoFinal ){
	long Resta;
	Resta=TiempoFinal-TiempoInicial;
//	return Resta/(1000);
	return Resta;
}

public static String EstimaTimepoRestante(long TotalRegistros, int IncLineas, long msecsInc, int TotalLineas, long msecsTotal){
	String Texto="";
	if ((msecsInc!=0 )&&(IncLineas!=0)&&(msecsTotal!=0)&&(TotalLineas!=0)&&(TotalRegistros!=0))
	{
//		long Restante1=(TotalRegistros/IncLineas/msecsInc);
		if (msecsInc<0.0000001){
			msecsInc=(long) 0.0000001;
		}
		double mseclinea=IncLineas/msecsInc;
		double Totalsecs=TotalRegistros/mseclinea/1000;
		int Totalmins=(int) (Totalsecs/60);
		int TotalHoras=Totalmins/60;
		
//		 Texto="     ->Estim. Final: "+String.valueOf(Totalmins)+ " mins ("+String.valueOf(TotalHoras)+" horas)";
		 Texto="     ->Estim. Final: "+String.valueOf(Totalmins);
		
	}
	return Texto;
	
}

public static void AppendFicheroControl (int Fichero, String Ruta, int Sufijo, int Lineas,int Contratos, int Pobs,
										int IncLineas, int IncContratos, int IncPobs, long Tiempo, long msecTranscurridos,
										String Estimado){
	
	BufferedWriter out = null;
	try {
	//	out=new BufferedWriter(new FileWriter(Ruta+"Control_"+String.valueOf(Sufijo)+".txt", true));
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


public static void addCostAtrib(CostComplexType Coste, String f_costCompanyCode, String f_costTransferDate) throws DatatypeConfigurationException {
	Coste.setCompanyCode(f_costCompanyCode);
	Coste.setCostTransferDate(FechaXML(f_costTransferDate));
}


public static void addPOBLvlAtrib(POBLevelComplexType pOBlvlElement, String f_cost_POBID) {
	pOBlvlElement.setServiceIDDeviceID(f_cost_POBID);
}


public static void addCostAmountAtrib(AmountComplexType amountElement, BigDecimal importe, String f_costType, String f_costRefAccount) {
	// TODO Auto-generated method stub
	amountElement.setCostAmount(importe);
	amountElement.setCostType(f_costType);
	amountElement.setReferenceAccount(f_costRefAccount);
}


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


//	public static void addDeviceAtrib(DeviceComplexType Device, String s_CD_POB, String s_ID_Unico, String s_StartDate, String s_EndDate) throws DatatypeConfigurationException{
		
//		Device.setDeviceCode(s_CD_POB);
//		Device.setDeviceID(s_ID_Unico);
//		Device.setDeviceTransferDate(FechaXML(s_StartDate));
		


	//}




	
	
	
	
	
	
	
	
	
	
}
