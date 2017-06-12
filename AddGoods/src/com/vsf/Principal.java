package com.vsf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.Vector;
import java.util.HashMap;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.vsf.*;
import com.vsf.S15.AddGoods.*;


public class Principal {

	// Indices de los campos al deconstruir la linea del fichero
	// Para el evento/Contrato
	static final int f_consumerType                     =0; 
	static final int f_replaceType                      =1; 
	static final int f_eventType						=2;                                                                 
	static final int f_eventDate						=3;                                                                 
	static final int f_eventContractID					=4; 
	static final int f_companyCode						=5; 
	static final int f_catchUpIndicator					=6; 
	static final int f_billingType						=7; 
	static final int f_currency							=8; 
	static final int f_TipoElemento						=9; 
	static final int f_POB_CD_POB						=10;
	static final int f_POB_ID_Unico						=11;
	static final int f_POB_serviceTimeUnit				=12;
	static final int f_POB_activatedServices			=13;                                                        
	static final int f_POB_transferDate					=14;        
	static final int f_POB_StartDate					=15;
	static final int f_POB_EndDate						=16;
	static final int f_POB_BillProfIndex				=17;
	static final int f_POB_BillProf						=18;
	static final int f_POB_ssp							=19;
	static final int f_POB_oneOffPaymentType			=20;
	static final int f_POB_oneOffPaymentAmount			=21;
	static final int f_POB_serviceEndDateEstimated		=22;
	static final int f_POB_financingDiscountRate		=23;
	static final int f_POB_COPA_customerType			=24;
	static final int f_POB_COPA_callOriginDestination	=25;
	static final int f_POB_COPA_channel					=26;
	static final int f_POB_COPA_segment					=27;
	static final int f_POB_COPA_bearerTechnology		=28;     
	static final int f_POB_COPA_valueTier				=29;                       
	static final int f_POB_COPA_proposition				=30;
	static final int f_POB_COPA_deviceTechnology		=31;
	static final int f_POB_COPA_customer				=32;
	static final int f_POB_COPA_spare1					=33;
	static final int f_POB_COPA_spare2					=34;
	static final int f_POB_COPA_brand					=35;
	static final int f_POB_COPA_documentType			=36;
	static final int f_POB_COPA_tradingPartner			=37;
	static final int f_POB_COPA_batch					=38;
	static final int f_POB_COPA_valuationType			=39;
	static final int f_POB_COPA_functionalArea			=40;
	static final int f_POB_COPA_orderNumber				=41;
	static final int f_POB_COPA_salesOffice				=42;
	static final int f_POB_COPA_salesOrg				=43;
	static final int f_POB_maxRolloverPeriod			=44;
	static final int f_POB_discountIndicator			=45;
	static final int f_POB_quantity						=46;
	static final int f_POB_avgDiscountFactor			=47;
	static final int f_POB_companyCode					=48;                               
	static final int f_POB_firstPlanBillingDate			=49;                                
	static final int f_POB_profitCenter					=50;
	static final int f_POB_excludeFromAllocation		=51;
	static final int f_POB_referenceAccount				=52;
	static final int f_POB_pobName						=53;
	static final int f_POB_billingType					=54;
	static final int f_POB_indirectChannel				=55;                          
	static final int f_POB_serviceType					=56;                     
	static final int f_POB_Cost_companyCode				=57;
	static final int f_POB_Cost_costTransferDate		=58;
	static final int f_POB_Cost_serviceIDDeviceID		=59;
	static final int f_POB_Cost_costAmount				=60;
	static final int f_POB_Cost_costType				=61;                                
	static final int f_POB_Cost_referenceAccount		=62;                                         
	static final int f_FEE_ID							=63;
	static final int f_FEE_Type							=64;
	static final int f_FEE_Amount						=65;
	static final int f_FEE_ProfitCenter					=66;
	static final int f_FEE_RefAccount					=67;
	static final int f_FEE_POBName						=68;
	static final int f_FEE_Currency						=69;
	static final int f_Fund_ID							=70;
	static final int f_Fund_Start_Date					=71;
	static final int f_Fund_End_Date					=72;             
	static final int f_Fund_Type						=73;
	static final int f_Fund_Amount						=74;
	static final int f_Fund_Amount_Utilized 			=75;
	static final int f_Fund_Profit_Center				=76;
	static final int f_Fund_Reference_Account			=77;
	static final int f_Fund_POB_Name					=78;
	
	// Variables de control de flujo
	static String ID_Servicio="";
	static String ID_Device="";
	static String POB_Code="";
	static String Cost_companyCode="";
	static String Cost_transferDate="";
	static String Cost_POBID="";
	static String Fee_ID="";
	static String ID_Fund="";
	
	static int NumLinea=0;
	static int NumFichero =0;
	static int NumContratos=0;
	static int NumContratosXfichero=1;
	static long NumSeqInit=0;
	
	static String isConsumer="";
	static String isReplace="";

	// Variables fichero de control
	static final String ficheroSalidaControl="";
	static int CtrlNumPobs=0;
	static int CtrlContratos=0;
	static int AntCtrlNumPobs=0;
	static int AntCNumLinea=0;
	static int AntNumContratos=0;
	static int CtrlNumCosts=0;
	static int CtrlNumFees=0;
	static long TiempoInicial;
	static long TiempoFinal;
	static Date fechaInicio=new Date();
	static Date fechaFin=new Date();
	static long AntTiempo;
	static long TiempoActual;
	static Date AntFecha=new Date();
	static Date FechaActual=new Date();
	static long TiempoTranscurrido;
	static long TotalRegistros=58000000;

	// Variables de formato de ficheros de salida
	static String CountryCode="es";
	static String EventType="add_goods_services";
	static String contractEventTypeBase="Add_Goods_Services";
	static String contractEventType="";
	static String consumerType="";
	static String SeqIDName="";
	static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	static Date currentDate = new Date();
	static DateFormat timeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	static Calendar cal = Calendar.getInstance();
	static String SourceEvent="CON_Add_Goods_Services";
	static String SourceOpCo="ES";

	// Fichero en el que se escribe la actualización del número de secuencia
	static String SeqSqlFile = "TWU15Y12.sql";

	public static void main(String[] args) throws IOException, DatatypeConfigurationException, JAXBException, InstantiationException, IllegalAccessException  {
		// TODO Auto-generated method stub
		
		// Obtenemos los parámetros: fichero csv, ruta de salida, fichero de log, fichero con los números de secuencia, ruta donde dejar el sql de secuencia
		String Fichero=args[0];
		String OutPath=args[1];
		OutPath=OutPath+"/";
		String log_file=args[2];
		String seq_file=args[3];
		String sqldir=args[4];
		
		// Obtención de los números de secuencia actuales
		SeqSqlFile = sqldir+"/TWU15Y12.sql";
		HashMap<String, Integer> SeqIDs = Utiles.getSeqID(seq_file);
		HashMap<String, Integer> NewSeqIDs = Utiles.getSeqID(seq_file);
		NumContratosXfichero=SeqIDs.get("Contratos_X_Fichero");

		// Inicializamos objetos
		String linea;
		String[]Campos;
		AddGoodsServices S15AddGoodsServices = new AddGoodsServices();
		FileHeaderComplexType fileHeader = new FileHeaderComplexType();
		FileFooterComplexType fileFooter = new FileFooterComplexType();
		AddGoodsServicesComplexType lstAddGoodsServices = new AddGoodsServicesComplexType();
		AddGoodsServicesType tdAddGoodsServices = new AddGoodsServicesType();
		ServiceListComplexType vListaServ = new ServiceListComplexType(); // Nueva Lista de servicios
		DeviceListComplexType vListaDev = new DeviceListComplexType();// Nueva Lista de servicios
		ServiceComplexType Servicio = new ServiceComplexType();
		ServiceBillingProfileComplexType ServBillProf= new ServiceBillingProfileComplexType();
		OneOffPaymentListComplexType ServOneOffList = new OneOffPaymentListComplexType();
		DeviceComplexType Device = new DeviceComplexType();
		DeviceBillingProfileComplexType DevBillProf= new DeviceBillingProfileComplexType();
		OneOffPaymentListComplexType DevOneOffList = new OneOffPaymentListComplexType();
		MIAttributesComplexType COPAService = new MIAttributesComplexType();
		MIAttributesComplexType COPADevice = new MIAttributesComplexType();
		// Costes
		CostListComplexType CostList= new CostListComplexType();
		CostComplexType CostElement = new CostComplexType();
		POBLevelListComplexType POBLvlList=new POBLevelListComplexType();
		POBLevelComplexType POBlvlElement=new POBLevelComplexType();
		AmountListComplexType AmountList=new AmountListComplexType();
		AmountComplexType AmountElement=new AmountComplexType();
		FundComplexType Fund = new FundComplexType();
		FundsListComplexType FundList = new FundsListComplexType();
		//Fees
		FeeListComplexType FeeList = new FeeListComplexType();
		FeeComplexType FeeElement = new FeeComplexType();

		// Variable para guardar y detectar el cambio de contrato
		String aContratcID="";
		System.out.println("Comenzando generacion XML...");
		
		NumLinea=1;
		
		//File FicheroControl=new File ("Fichero.txt");
		TiempoInicial=fechaInicio.getTime();
		AntTiempo=TiempoInicial;
		//Utiles.EscribeHoraFileControl(Fichero, TiempoInicial);
		
		// Lectura del Fichero
		try {
			BufferedReader reader =	new BufferedReader(new	FileReader(Fichero));
			while((linea = reader.readLine())!=null) {
				Campos = linea.split(";"); 
				if (!aContratcID.equals(Campos[f_eventContractID].trim())) {
					NumContratos ++;
					
					// Si se supera el número de contratos máximo por fichero o cambia el tipo de consumer se genera un nuevo fichero
					if (NumContratosXfichero<NumContratos || (!isConsumer.equals(Campos[f_consumerType].trim()) && NumLinea>1) || 
							(!isReplace.equals(Campos[f_replaceType].trim()) && NumLinea>1))
					{
						AntNumContratos=CtrlContratos;
						CtrlContratos=AntNumContratos+NumContratos;
						NumFichero ++;
						// Se añaden los atributos de la cabecera
						Utiles.AddHeaderAttrib(fileHeader, consumerType, CountryCode, EventType, currentDate, cal, NumSeqInit+NumFichero, SourceEvent, SourceOpCo);
						// Se actualizan los números de secuencia
						NewSeqIDs.put(SeqIDName, SeqIDs.get(SeqIDName)+NumFichero);
						// Se establece el número de registros del fichero en el footer
						fileFooter.setNumberRecords(BigInteger.valueOf(NumContratos-1));
						// Llamada a la generación del fichero xml
						Utiles.GeneraAddGoods(S15AddGoodsServices, OutPath+fileHeader.getFileName(), log_file);
						NumContratos=1;
						TiempoActual=new Date().getTime();
						long Tiempo=Utiles.RestaFechas(AntTiempo, TiempoActual);
						long msecTranscurridos=Utiles.RestaFechas(TiempoInicial, TiempoActual);
						TotalRegistros=TotalRegistros-NumLinea;
						String Estimado1=Utiles.EstimaTimepoRestante(TotalRegistros,NumLinea-AntCNumLinea,Tiempo,
								NumLinea,msecTranscurridos );
						Utiles.AppendFicheroControl(NumFichero, ficheroSalidaControl, NumFichero, 
								NumLinea, CtrlContratos, CtrlNumPobs,
								NumLinea-AntCNumLinea,CtrlContratos-AntNumContratos,CtrlNumPobs-AntCtrlNumPobs,Tiempo,msecTranscurridos,Estimado1);
						AntCtrlNumPobs=CtrlNumPobs;
						AntCNumLinea=NumLinea;
						AntTiempo=TiempoActual;
						S15AddGoodsServices = new AddGoodsServices();
						lstAddGoodsServices = new AddGoodsServicesComplexType();
						fileHeader = new FileHeaderComplexType();
						fileFooter = new FileFooterComplexType();
					}
					
					// Se establecen las variables de nombrado de ficheros en función del consumer type
					if (Campos[f_consumerType].equals("1")) {
						contractEventType="CON_"+contractEventTypeBase;
						SourceEvent=contractEventType;
						SeqIDName=contractEventType;
						consumerType="consumer";
					} else {
						contractEventType="ENT_"+contractEventTypeBase;
						SourceEvent=contractEventType;
						SeqIDName=contractEventType;
						consumerType="enterprise";
					}
					// Obtención del número de secuencia inicial
					NumSeqInit=SeqIDs.get(SeqIDName);
					// Se añade REPLACE si aplica
					if (Campos[f_replaceType].equals("1")) {
						contractEventType=contractEventType+"_REPLACE";
						SourceEvent=contractEventType;
					}
					// Si cambia el tipo de consumer se establece NumFichero a 0 para empezar desde el número de secuencia correspondiente
					if ((!isConsumer.equals(Campos[f_consumerType].trim()) && NumLinea>1)) // || (!isReplace.equals(Campos[f_replaceType].trim()) && NumLinea>1))
					{
						NumFichero=0;
					}
					
					// Creacción del objeto AddGoods y carga de atributos de contrato
					tdAddGoodsServices = new AddGoodsServicesType();
					lstAddGoodsServices.getAddGoodsServices().add(tdAddGoodsServices);
					S15AddGoodsServices.setData(lstAddGoodsServices);
					S15AddGoodsServices.setHeader(fileHeader);
					S15AddGoodsServices.setFooter(fileFooter);
					vListaServ = new ServiceListComplexType();
					vListaDev = new DeviceListComplexType();
					CostList = new CostListComplexType();
					FeeList = new FeeListComplexType();
					FundList = new FundsListComplexType();
					tdAddGoodsServices.setEventContractID(Campos[f_eventContractID]);
					Utiles.addContractAtrib(tdAddGoodsServices, 
							contractEventType,
							Campos[f_eventDate],
							Campos[f_eventContractID],
							Campos[f_companyCode],
							Campos[f_catchUpIndicator],
							Campos[f_billingType],
							Campos[f_currency]);
				}

				/// PARTE DE POBS 
				// Servicios
				if (Utiles.EsServicio(Campos[f_TipoElemento])){
					// Se informan los datos de servicios 
					// Si cambia el ID de servicio se crea uno nuevo
					tdAddGoodsServices.setServiceList(vListaServ);
					if (!ID_Servicio.equals(Campos[f_POB_ID_Unico])||!POB_Code.equals(Campos[f_POB_CD_POB])||!aContratcID.equals(Campos[f_eventContractID].trim())){
						Servicio= new ServiceComplexType();
						ServBillProf = new ServiceBillingProfileComplexType();
						ServOneOffList = new OneOffPaymentListComplexType();
						// Se añaden los atributos a nivel de POB y se añade a la lista de servicios
						Utiles.addServiceAtrib(Servicio,
								Campos[f_POB_CD_POB],
								Campos[f_POB_ID_Unico],
								Campos[f_POB_serviceTimeUnit],
								Campos[f_POB_activatedServices],
								Campos[f_POB_transferDate],
								Campos[f_POB_StartDate],
								Campos[f_POB_EndDate],
								Campos[f_POB_ssp],
								Campos[f_POB_serviceEndDateEstimated],
								Campos[f_POB_maxRolloverPeriod],
								Campos[f_POB_discountIndicator],
								Campos[f_POB_quantity],
								Campos[f_POB_companyCode],
								Campos[f_POB_firstPlanBillingDate],
								Campos[f_POB_profitCenter],
								Campos[f_POB_excludeFromAllocation],
								Campos[f_POB_referenceAccount],
								Campos[f_POB_pobName],
								Campos[f_POB_billingType],
								Campos[f_POB_indirectChannel],
								Campos[f_POB_serviceType]
								);
						vListaServ.getService().add(Servicio);// Agregamos a la lista de servicios
						CtrlNumPobs ++;
					}					
					// Billing Profile
					if (Campos[f_POB_BillProf].length()!=0){
						BigDecimal Importe = new BigDecimal(Campos[f_POB_BillProf]);
						ServBillProf.getBillingAmount().add(Importe);
						Servicio.setServiceBillingProfile(ServBillProf);
					}
					// One Off
					if (Campos[f_POB_oneOffPaymentAmount].length()!=0){
						BigDecimal Importe = new BigDecimal(Campos[f_POB_oneOffPaymentAmount]);
						OneOffPaymentComplexType servOneOff = new OneOffPaymentComplexType();
						servOneOff.setOneOffPaymentAmount(Importe);
						if (Campos[f_POB_oneOffPaymentType].length()!=0) servOneOff.setOneOffPaymentType(Campos[f_POB_oneOffPaymentType]);
						ServOneOffList.getOneOffPayment().add(servOneOff);
						Servicio.setOneOffPayments(ServOneOffList);
					}
					/// COPA Servicios
					COPAService=new MIAttributesComplexType();
					Utiles.AddPobCOPAServ(Servicio,COPAService, 
							Campos[f_POB_COPA_customerType],
							Campos[f_POB_COPA_callOriginDestination],
							Campos[f_POB_COPA_channel],
							Campos[f_POB_COPA_segment],
							Campos[f_POB_COPA_bearerTechnology],
							Campos[f_POB_COPA_valueTier],
							Campos[f_POB_COPA_proposition],
							Campos[f_POB_COPA_deviceTechnology],
							Campos[f_POB_COPA_customer],
							Campos[f_POB_COPA_spare1],
							Campos[f_POB_COPA_spare2],
							Campos[f_POB_COPA_brand],
							Campos[f_POB_COPA_documentType],
							Campos[f_POB_COPA_tradingPartner],
							Campos[f_POB_COPA_batch],
							Campos[f_POB_COPA_valuationType],
							Campos[f_POB_COPA_functionalArea],
							Campos[f_POB_COPA_orderNumber],
							Campos[f_POB_COPA_salesOffice],
							Campos[f_POB_COPA_salesOrg]
							);

					ID_Servicio=Campos[f_POB_ID_Unico];
					POB_Code=Campos[f_POB_CD_POB];
				
				// Dispositivos
				} else if (Utiles.EsDispositivo(Campos[f_TipoElemento])){
					tdAddGoodsServices.setDeviceList(vListaDev);
					if (!ID_Device.equals(Campos[f_POB_ID_Unico])||!POB_Code.equals(Campos[f_POB_CD_POB])||!aContratcID.equals(Campos[f_eventContractID].trim())){
						Device= new DeviceComplexType();
						DevBillProf = new DeviceBillingProfileComplexType();
						Utiles.addDeviceAtrib(Device,
								Campos[f_POB_CD_POB],
								Campos[f_POB_ID_Unico],
								Campos[f_POB_serviceTimeUnit],
								Campos[f_POB_transferDate],
								Campos[f_POB_StartDate],
								Campos[f_POB_EndDate],
								Campos[f_POB_ssp],
								Campos[f_POB_financingDiscountRate],
								Campos[f_POB_discountIndicator],
								Campos[f_POB_quantity],
								Campos[f_POB_companyCode],
								Campos[f_POB_firstPlanBillingDate],
								Campos[f_POB_profitCenter],
								Campos[f_POB_excludeFromAllocation],
								Campos[f_POB_referenceAccount],
								Campos[f_POB_pobName],
								Campos[f_POB_billingType]
								);
						vListaDev.getDevice().add(Device);
						CtrlNumPobs ++;
					}
					// Billing Profile
					if (Campos[f_POB_BillProf].length()!=0){
						BigDecimal Importe = new BigDecimal(Campos[f_POB_BillProf]);
						DevBillProf.getBillingAmount().add(Importe);
						Device.setDeviceBillingProfile(DevBillProf);
					}
					// One Off
					if (Campos[f_POB_oneOffPaymentAmount].length()!=0){
						BigDecimal Importe = new BigDecimal(Campos[f_POB_oneOffPaymentAmount]);
						OneOffPaymentComplexType devOneOff = new OneOffPaymentComplexType();
						devOneOff.setOneOffPaymentAmount(Importe);
						if (Campos[f_POB_oneOffPaymentType].length()!=0) devOneOff.setOneOffPaymentType(Campos[f_POB_oneOffPaymentType]);
						DevOneOffList.getOneOffPayment().add(devOneOff);
						Device.setOneOffPayments(DevOneOffList);
					}
					/// COPA Dispositivos
					COPADevice=new MIAttributesComplexType();
					Utiles.AddPobCOPADev(Device,COPADevice, 
							Campos[f_POB_COPA_customerType],
							Campos[f_POB_COPA_callOriginDestination],
							Campos[f_POB_COPA_channel],
							Campos[f_POB_COPA_segment],
							Campos[f_POB_COPA_bearerTechnology],
							Campos[f_POB_COPA_valueTier],
							Campos[f_POB_COPA_proposition],
							Campos[f_POB_COPA_deviceTechnology],
							Campos[f_POB_COPA_customer],
							Campos[f_POB_COPA_spare1],
							Campos[f_POB_COPA_spare2],
							Campos[f_POB_COPA_brand],
							Campos[f_POB_COPA_documentType],
							Campos[f_POB_COPA_tradingPartner],
							Campos[f_POB_COPA_batch],
							Campos[f_POB_COPA_valuationType],
							Campos[f_POB_COPA_functionalArea],
							Campos[f_POB_COPA_orderNumber],
							Campos[f_POB_COPA_salesOffice],
							Campos[f_POB_COPA_salesOrg]
							);
					ID_Device=Campos[f_POB_ID_Unico];
					POB_Code=Campos[f_POB_CD_POB];

				// Funds
				} else if (Utiles.EsFund(Campos[f_TipoElemento])){
					tdAddGoodsServices.setFundList(FundList);
					if (!ID_Fund.equals(Campos[f_Fund_ID])||!aContratcID.equals(Campos[f_eventContractID].trim())){
						Fund=new FundComplexType();
						Utiles.addFundAtrib(Fund,
								Campos[f_Fund_ID],					
								Campos[f_Fund_Start_Date],			
								Campos[f_Fund_End_Date],			
								Campos[f_Fund_Type],				
								Campos[f_Fund_Amount],				
								Campos[f_Fund_Amount_Utilized], 	
								Campos[f_Fund_Profit_Center],		
								Campos[f_Fund_Reference_Account],	
								Campos[f_Fund_POB_Name]		
								);
						FundList.getFund().add(Fund);
						CtrlNumPobs ++;
					}
					ID_Fund=Campos[f_Fund_ID];
					
				// Costes	
				} else if (Utiles.EsCoste(Campos[f_TipoElemento])){
					tdAddGoodsServices.setCostList(CostList);
					// Si cambia de CompanyCode o TransferDate se genera un nuevo Coste
					if (!Cost_companyCode.equals(Campos[f_POB_Cost_companyCode])||!Cost_transferDate.equals(Campos[f_POB_Cost_costTransferDate])||!aContratcID.equals(Campos[f_eventContractID].trim())){
						CostElement = new CostComplexType();
						POBLvlList=new POBLevelListComplexType();
						POBlvlElement=new POBLevelComplexType();
						AmountList=new AmountListComplexType();
						Utiles.addCostAtrib(CostElement, Campos[f_POB_Cost_companyCode],Campos[f_POB_Cost_costTransferDate]);
						CostList.getCost().add(CostElement);// Agregamos a la lista de costes
						Utiles.addPOBLvlAtrib(POBlvlElement, Campos[f_POB_Cost_serviceIDDeviceID]);
						POBLvlList.getPOBLevel().add(POBlvlElement);
						CostElement.setPOBLevels(POBLvlList);			
						POBlvlElement.getAmounts().add(0, AmountList);
						// Si cambia de serviceIDDeviceID se genera un nuevo POBLevel
					} else if (!Cost_POBID.equals(Campos[f_POB_Cost_serviceIDDeviceID])){
						POBlvlElement=new POBLevelComplexType();
						AmountList=new AmountListComplexType();
						Utiles.addPOBLvlAtrib(POBlvlElement, Campos[f_POB_Cost_serviceIDDeviceID]);
						POBLvlList.getPOBLevel().add(POBlvlElement);
						CostElement.setPOBLevels(POBLvlList);			
						POBlvlElement.getAmounts().add(0, AmountList);
					}
					AmountElement=new AmountComplexType();
					BigDecimal Importe = new BigDecimal(Campos[f_POB_Cost_costAmount]);
					Utiles.addCostAmountAtrib(AmountElement, Importe, Campos[f_POB_Cost_costType],
							Campos[f_POB_Cost_referenceAccount]);
					AmountList.getAmount().add(AmountElement);
					Cost_companyCode=Campos[f_POB_Cost_companyCode];
					Cost_transferDate=Campos[f_POB_Cost_costTransferDate];
					Cost_POBID=Campos[f_POB_Cost_serviceIDDeviceID];
					CtrlNumCosts ++;

				// Fees
				} else if (Utiles.EsFee(Campos[f_TipoElemento])){
					tdAddGoodsServices.setFeeList(FeeList);
					if (!Fee_ID.equals(Campos[f_FEE_ID])||!aContratcID.equals(Campos[f_eventContractID].trim())){
						FeeElement = new FeeComplexType();
					}
					BigDecimal ImporteFee = new BigDecimal(Campos[f_FEE_Amount]);
					Utiles.addFeeAtrib(FeeElement, Campos[f_FEE_ID], Campos[f_FEE_Type], ImporteFee,
							Campos[f_FEE_ProfitCenter], Campos[f_FEE_RefAccount], Campos[f_FEE_POBName]);
					FeeList.getFee().add(FeeElement);
					/////////////////////
					Fee_ID=Campos[f_FEE_ID];
					CtrlNumFees ++;	

				} else {
					System.out.println("Can't find element type (Service/Device)");
				}// FIN POBS

				aContratcID=Campos[f_eventContractID].trim();
				isConsumer=Campos[f_consumerType];
				isReplace=Campos[f_replaceType];
				
				NumLinea ++;
			} // Fin lectura lineas fichero
			reader.close();
			// Cuando acaba con el fichero imprime el resto.
			if (NumContratosXfichero>=NumContratos && NumLinea>1 ){
				NumFichero ++; // Incrementamos para saber el numero de ficheros generados
				Utiles.AddHeaderAttrib(fileHeader, consumerType, CountryCode, EventType, currentDate, cal, NumSeqInit+NumFichero, SourceEvent, SourceOpCo);
				NewSeqIDs.put(SeqIDName, SeqIDs.get(SeqIDName)+NumFichero);
				fileFooter.setNumberRecords(BigInteger.valueOf(NumContratos));
				Utiles.GeneraAddGoods(S15AddGoodsServices, OutPath+fileHeader.getFileName(), log_file);
				// Escribe el fichero de control de exportacion
				AntNumContratos=CtrlContratos;
				CtrlContratos=AntNumContratos+NumContratos;
				TiempoActual=new Date().getTime();
				long Tiempo=Utiles.RestaFechas(AntTiempo, TiempoActual);
				long msecTranscurridos=Utiles.RestaFechas(TiempoInicial, TiempoActual);
				TotalRegistros=TotalRegistros-NumLinea;
				String Estimado1=Utiles.EstimaTimepoRestante(TotalRegistros,NumLinea-AntCNumLinea,Tiempo,
						NumLinea,msecTranscurridos );
				Utiles.AppendFicheroControl(NumFichero, ficheroSalidaControl, NumFichero, 
						NumLinea, CtrlContratos, CtrlNumPobs,
						NumLinea-AntCNumLinea,CtrlContratos-AntNumContratos,CtrlNumPobs-AntCtrlNumPobs,Tiempo,msecTranscurridos,Estimado1);
				AntCtrlNumPobs=CtrlNumPobs;
				AntCNumLinea=NumLinea;
				AntNumContratos=NumContratos;
				AntTiempo=TiempoActual;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File "+Fichero+" not found.");
			//e.printStackTrace();			
		}
		
		// Se escribe el update en el sql de los números de secuencia
		Utiles.updateSeqID(SeqSqlFile, SeqIDs, NewSeqIDs);
		
		TiempoFinal=fechaFin.getTime();
		//		Utiles.EscribeHoraFileControl(Fichero, TiempoFinal);
		System.out.println("Finalizada extraccion !!!!");	
	}
}
