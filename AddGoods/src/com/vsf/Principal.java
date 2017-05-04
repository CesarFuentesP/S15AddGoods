package com.vsf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
//import java.util.Vector;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.vsf.*;
import com.vsf.S15.AddGoods.*;

public class Principal {

	static int NumLinea=0;
	// Indices de los campos al deconstruir la linea del fichero
	// Para el evento/Contrato
	static final int f_eventType						=0;
	static final int f_eventDate						=1;
	static final int f_eventContractID					=2;
	static final int f_companyCode						=3;
	static final int f_catchUpIndicator					=4;
	static final int f_billingType						=5;
	static final int f_currency							=6;
	static final int f_TipoElemento						=7;
	static final int f_POB_CD_POB						=8;
	static final int f_POB_ID_Unico						=9;
	static final int f_POB_serviceTimeUnit				=10;
	static final int f_POB_activatedServices			=11;
	static final int f_POB_transferDate					=12;
	// Para el array de Servicios o Dispositivos
	static final int f_POB_StartDate					=13; //Determina si es un Dispositivo (D) o un Servicio (S)
	static final int f_POB_EndDate						=14;
	static final int f_POB_BillProfIndex				=15; // 
	static final int f_POB_BillProf						=16; //Aplica solo a Servicios 
	static final int f_POB_ssp							=17; //Aplica solo a Servicios 
	static final int f_POB_oneOffPaymentType			=18; // 
	static final int f_POB_oneOffPaymentAmount			=19; // Fecha inicio Servicio / Transfer Date Dispositivo
	static final int f_POB_serviceEndDateEstimated		=20; // Fecha fin Servicio / null Dispositivo
	static final int f_POB_financingDiscountRate		=21; // Orden de los valores de Billing Profile. Uso interno
	static final int f_POB_COPA_customerType			=22; // Billing Profile
	static final int f_POB_COPA_callOriginDestination	=23;
	static final int f_POB_COPA_channel					=24;
	static final int f_POB_COPA_segment					=25;
	static final int f_POB_COPA_bearerTechnology		=26; // Solo aplica a SERVICIOS
	static final int f_POB_COPA_valueTier				=27; // Solo aplica a DISPOSITIVOS
	// Para COPA a nivel de POB
	static final int f_POB_COPA_proposition				=28;
	static final int f_POB_COPA_deviceTechnology		=29;
	static final int f_POB_COPA_customer				=30;
	static final int f_POB_COPA_spare1					=31;
	static final int f_POB_COPA_spare2					=32;
	static final int f_POB_COPA_brand					=33;
	static final int f_POB_COPA_documentType			=34;
	static final int f_POB_COPA_tradingPartner			=35;
	static final int f_POB_COPA_batch					=36;
	static final int f_POB_COPA_valuationType			=37;
	static final int f_POB_COPA_functionalArea			=38;
	static final int f_POB_COPA_orderNumber				=39;
	static final int f_POB_COPA_salesOffice				=40;
	static final int f_POB_COPA_salesOrg				=41;
	static final int f_POB_maxRolloverPeriod			=42;
	static final int f_POB_discountIndicator			=43;
	static final int f_POB_quantity						=44;
	static final int f_POB_avgDiscountFactor			=45;
	static final int f_POB_companyCode					=46;
	static final int f_POB_firstPlanBillingDate			=47;
	// Continuamos con POB 
	static final int f_POB_profitCenter					=48;// Solo aplica a SERVICIOS
	static final int f_POB_excludeFromAllocation		=49;
	static final int f_POB_referenceAccount				=50;
	static final int f_POB_pobName						=51;// Solo aplica a DISPOSITIVOS (También está a nivel de contrato)
	static final int f_POB_billingType					=52;
	static final int f_POB_indirectChannel				=53;
	static final int f_POB_serviceType					=54;
	//Costes // Solo aplica para SVT
	static final int f_POB_Cost_companyCode				=55;
	static final int f_POB_Cost_costTransferDate		=56;
	static final int f_POB_Cost_serviceIDDeviceID		=57;
	static final int f_POB_Cost_costAmount				=58;
	static final int f_POB_Cost_costType				=59; // Solo aplica a SERVICIOS
	static final int f_POB_Cost_referenceAccount		=60; // Solo aplica a SERVICIOS
	//FEE
	static final int f_FEE_ID							=61; 
	static final int f_FEE_Type							=62; 
	static final int f_FEE_Amount						=63; //Se crea para la matriz de POB_Level
	static final int f_FEE_ProfitCenter					=64; // Matriz Amount dentreo de POB_Level
	static final int f_FEE_RefAccount					=65; // Matriz Amount dentreo de POB_Level
	static final int f_FEE_POBName						=66; // Matriz Amount dentreo de POB_Level
	static final int f_FEE_Currency						=67;

	//'1' AS FEE_ID,
	//'Fee_type' AS FEE_TYPE,
	//1 AS FEE_AMOUNT,
	//'ProfitC' AS FEE_PROFITCENTER,
	//'Refaccount' AS FEE_REFERENCEACCOUNT,
	//'Pob_name' AS FEE_POB_NAME,
	//'EUR' AS FEE_CURRENCY,

	static String ID_Servicio="";
	static String ID_Device="";
	static String POB_Code="";
	static String Cost_companyCode="";
	static String Cost_transferDate="";
	static String Cost_POBID="";
	static String Fee_ID="";

	//Para Windows
	//static final String ficheroSalidaXML="C:\\VSF-JAVA\\WKSVSF\\VICXML\\salida\\vicsalida\\CON_";
	//static final String ficheroSalidaXML="C:\\VSF-JAVA\\WKSVSF\\VICXML\\salida\\CON_";
	//static final String ficheroSalidaControl="C:\\VSF-JAVA\\WKSVSF\\VICXML\\salida\\";

	// PAra unix
	static final String ficheroSalidaControl="";
	static final String ficheroSalidaXML="CON";


	static int NumFichero =0;
	static int NuevoFichero=0;
	static int NuevoContrato=0;
	static int NumContratos=1;
	static int NumContratosXfichero=2;
	//static int NumContratosXfichero=23000;

	static int GeneradoFichero=0;

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

	public static void main(String[] args) throws IOException, DatatypeConfigurationException, JAXBException, InstantiationException, IllegalAccessException  {
		// TODO Auto-generated method stub
		String Fichero=args[0];
		String linea;
		String[]Campos;
		// Inicializamos objetos
		AddGoodsServices S15AddGoodsServices = new AddGoodsServices();
		AddGoodsServicesComplexType lstAddGoodsServices = new AddGoodsServicesComplexType();
		AddGoodsServicesType tdAddGoodsServices = new AddGoodsServicesType();
		ServiceListComplexType vListaServ = new ServiceListComplexType(); // Nueva Lista de servicios
		DeviceListComplexType vListaDev = new DeviceListComplexType();// Nueva Lista de servicios
		ServiceComplexType Servicio = new ServiceComplexType();
		ServiceBillingProfileComplexType ServBillProf= new ServiceBillingProfileComplexType();
		DeviceComplexType Device = new DeviceComplexType();
		DeviceBillingProfileComplexType DevBillProf= new DeviceBillingProfileComplexType();
		MIAttributesComplexType COPAService = new MIAttributesComplexType();
		MIAttributesComplexType COPADevice = new MIAttributesComplexType();
		// Costes
		CostListComplexType CostList= new CostListComplexType();
		CostComplexType CostElement = new CostComplexType();
		POBLevelListComplexType POBLvlList=new POBLevelListComplexType();
		POBLevelComplexType POBlvlElement=new POBLevelComplexType();
		AmountListComplexType AmountList=new AmountListComplexType();
		AmountComplexType AmountElement=new AmountComplexType();

		//Fees
		FeeListComplexType FeeList = new FeeListComplexType();
		FeeComplexType FeeElement = new FeeComplexType();

		// Variable para guardar y detectar el cambio de contrato
		String aContratcID="";
		System.out.println("Comenzando generacion XML...");
		NumLinea=1;
		NuevoFichero=1;
		//File FicheroControl=new File ("Fichero.txt");
		TiempoInicial=fechaInicio.getTime();
		AntTiempo=TiempoInicial;
		//Utiles.EscribeHoraFileControl(Fichero, TiempoInicial);
		// Lectura del Fichero
		try {
			BufferedReader reader =	new BufferedReader(new	FileReader(Fichero));
			while((linea = reader.readLine())!=null) {
				Campos = linea.split(";"); // Deconstruyo el registro en campos
				// Si cambia la POB o el contrato, generamos nuevo grupo (Esto se hace para Billing profile)			
				if (!ID_Servicio.equals(Campos[f_POB_ID_Unico])||!aContratcID.equals(Campos[f_eventContractID].trim())||!POB_Code.equals(Campos[f_POB_CD_POB])){
					if (NuevoFichero==1){ // Si se decide generar un nuevo fichero
						//	NumFichero ++; // Incrementamos para saber el numero de ficheros generados
						if (GeneradoFichero==1) {
							S15AddGoodsServices = new AddGoodsServices();
							lstAddGoodsServices = new AddGoodsServicesComplexType();
						}
						tdAddGoodsServices = new AddGoodsServicesType();
						lstAddGoodsServices.getAddGoodsServices().add(tdAddGoodsServices);
						S15AddGoodsServices.setData(lstAddGoodsServices);
						vListaServ = new ServiceListComplexType();
						vListaDev = new DeviceListComplexType();
						CostList = new CostListComplexType();
						FeeList = new FeeListComplexType();
						tdAddGoodsServices.setServiceList(vListaServ);	// Añadimos la lista de servicios
						tdAddGoodsServices.setDeviceList(vListaDev);	// Añadimos la lista de dispositivos
						tdAddGoodsServices.setCostList(CostList); 		// Añadimos la lista de costes
						tdAddGoodsServices.setFeeList(FeeList);			// Añadimos la lista de fees
						tdAddGoodsServices.setEventContractID(Campos[f_eventContractID]);
						Utiles.addContractAtrib(tdAddGoodsServices, 
								Campos[f_eventType],
								Campos[f_eventDate],
								Campos[f_eventContractID],
								Campos[f_companyCode],
								Campos[f_catchUpIndicator],
								Campos[f_billingType],
								Campos[f_currency]);
						NuevoFichero=0; 
					} else{
						// Deteccion de cambios de contrato, cuando no sea nuevo fichero que ya va implicito
						if (!aContratcID.equals(Campos[f_eventContractID].trim())) {
							NuevoContrato=1;
							NumContratos ++;
							if (GeneradoFichero==1) {
								S15AddGoodsServices = new AddGoodsServices();
								lstAddGoodsServices = new AddGoodsServicesComplexType();
							}
							tdAddGoodsServices = new AddGoodsServicesType();
							lstAddGoodsServices.getAddGoodsServices().add(tdAddGoodsServices);
							S15AddGoodsServices.setData(lstAddGoodsServices);
							vListaServ = new ServiceListComplexType();
							vListaDev = new DeviceListComplexType();
							CostList = new CostListComplexType();
							FeeList = new FeeListComplexType();
							tdAddGoodsServices.setServiceList(vListaServ);	// Añadimos la lista de servicios
							tdAddGoodsServices.setDeviceList(vListaDev);	// Añadimos la lista de dispositivos
							tdAddGoodsServices.setCostList(CostList); 		// Añadimos la lista de costes
							tdAddGoodsServices.setFeeList(FeeList);			// Añadimos la lista de fees
							tdAddGoodsServices.setEventContractID(Campos[f_eventContractID]);
							Utiles.addContractAtrib(tdAddGoodsServices, 
									Campos[f_eventType],
									Campos[f_eventDate],
									Campos[f_eventContractID],
									Campos[f_companyCode],
									Campos[f_catchUpIndicator],
									Campos[f_billingType],
									Campos[f_currency]);
						} else {NuevoContrato=0;}
					}
				}				
				aContratcID=Campos[f_eventContractID].trim();
				if (0==0){ //Para en debug no ejecutar este cacho
					///////////////////
					/// PARTE DE POBS 
					///////////////////
					////////////////////
					/// POBs Servicios
					////////////////////
					// Identificamos si es Servicio o Dispositivo
					if (Utiles.EsServicio(Campos[f_TipoElemento])){
						// Informamos los datos de servicios 
						// Si cambia de servicio se crea uno nuevo
						if (!ID_Servicio.equals(Campos[f_POB_ID_Unico])||!POB_Code.equals(Campos[f_POB_CD_POB])){
							Servicio= new ServiceComplexType();
							ServBillProf = new ServiceBillingProfileComplexType();
							//	Utiles.addServiceAtrib(Servicio, Campos[f_POB_CD_POB],Campos[f_POB_ID_Unico],Campos[f_POB_StartDate],Campos[f_POB_EndDate] ); // Asignamos los valores
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
						BigDecimal Importe = new BigDecimal(Campos[f_POB_BillProf]);
						// Temporal
						//	BigDecimal Importe = new BigDecimal("3");
						ServBillProf.getBillingAmount().add(Importe);
						Servicio.setServiceBillingProfile(ServBillProf);
						/////////////////////
						/// COPA SERVICIOS///
						/////////////////////
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
						/////////////////////
						ID_Servicio=Campos[f_POB_ID_Unico];
						POB_Code=Campos[f_POB_CD_POB];
						////////////////////
						/// POBs Dispositivos
						////////////////////
					} else if (Utiles.EsDispositivo(Campos[f_TipoElemento])){
						// Informamos los datos de dispositivos 
						// Si cambia de dispositivo se crea uno nuevo
						if (!ID_Device.equals(Campos[f_POB_ID_Unico])||!POB_Code.equals(Campos[f_POB_CD_POB])){
							Device= new DeviceComplexType();
							DevBillProf = new DeviceBillingProfileComplexType();
							//									Utiles.addDeviceAtrib(Device, Campos[f_POB_CD_POB],Campos[f_POB_ID_Unico],Campos[f_POB_StartDate],Campos[f_POB_EndDate] ); // Asignamos los valores
							Utiles.addDeviceAtrib(Device,
									Campos[f_POB_CD_POB],
									Campos[f_POB_ID_Unico],
									Campos[f_POB_serviceTimeUnit],
									//	Campos[f_POB_activatedServices],
									Campos[f_POB_transferDate],
									Campos[f_POB_StartDate],
									Campos[f_POB_EndDate],
									Campos[f_POB_ssp],
									Campos[f_POB_financingDiscountRate],
									//	Campos[f_POB_maxRolloverPeriod],
									Campos[f_POB_discountIndicator],
									Campos[f_POB_quantity],
									//  Campos[f_POB_avgDiscountFactor],
									Campos[f_POB_companyCode],
									Campos[f_POB_firstPlanBillingDate],
									Campos[f_POB_profitCenter],
									Campos[f_POB_excludeFromAllocation],
									Campos[f_POB_referenceAccount],
									Campos[f_POB_pobName],
									Campos[f_POB_billingType]
									);
							vListaDev.getDevice().add(Device);// Agregamos a la lista de servicios
							CtrlNumPobs ++;
						}
						// Billing Profile
						BigDecimal Importe = new BigDecimal(Campos[f_POB_BillProf]);
						// Temporal
						//BigDecimal Importe = new BigDecimal("3");
						//
						DevBillProf.getBillingAmount().add(Importe);
						Device.setDeviceBillingProfile(DevBillProf);
						/////////////////////
						/// COPA DEVICES///
						/////////////////////
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
						/////////////////////
						ID_Device=Campos[f_POB_ID_Unico];
						POB_Code=Campos[f_POB_CD_POB];
						
						//////////////////////////////////////////////
						/// PARTE DE COSTES ( A NIVEL DE POB ) ///////
						//////////////////////////////////////////////
					} else if (Utiles.EsCoste(Campos[f_TipoElemento])){
						// Informamos los datos de dispositivos 
						// Si cambia de CompanyCode o TransferDate se genera un nuevo Coste
						if (!Cost_companyCode.equals(Campos[f_POB_Cost_companyCode])||!Cost_transferDate.equals(Campos[f_POB_Cost_costTransferDate])){
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
						/////////////////////
						Cost_companyCode=Campos[f_POB_Cost_companyCode];
						Cost_transferDate=Campos[f_POB_Cost_costTransferDate];
						Cost_POBID=Campos[f_POB_Cost_serviceIDDeviceID];
						CtrlNumCosts ++;
						//////////////////////
						/// FIN COSTES ///////
						//////////////////////		
						
						///////////////////////////
						/// PARTE DE FEES  ////////
						///////////////////////////
					} else if (Utiles.EsFee(Campos[f_TipoElemento])){
						if (!Fee_ID.equals(Campos[f_FEE_ID])){
							FeeElement = new FeeComplexType();
						}
						BigDecimal ImporteFee = new BigDecimal(Campos[f_FEE_Amount]);
						Utiles.addFeeAtrib(FeeElement, Campos[f_FEE_ID], Campos[f_FEE_Type], ImporteFee,
								Campos[f_FEE_ProfitCenter], Campos[f_FEE_RefAccount], Campos[f_FEE_POBName]);
						FeeList.getFee().add(FeeElement);
						/////////////////////
						Fee_ID=Campos[f_FEE_ID];
						CtrlNumFees ++;	
						//////////////////////
						/// FIN FEES   ///////
						//////////////////////	
					} else {
						System.out.println("Can't find element type (Service/Device)");
					}
				}	
				//////////////////////////////////////
				/// CONTROL DE FICHEROS A GENERAR ////
				//////////////////////////////////////
				// Comprueba cuantos contratos se van a mandar en cada fichero. Controla que sea cuando finaliza el evento.
				if (NumContratosXfichero<NumContratos && NuevoContrato==1)
				{
					AntNumContratos=CtrlContratos;
					CtrlContratos=AntNumContratos+NumContratos;
					Utiles.Genera(S15AddGoodsServices, ficheroSalidaXML, NumFichero); // Comentado en pruebas
					NumFichero ++; // Incrementamos para saber el numero de ficheros generados
					NuevoFichero=1;
					NumContratos=0;
					GeneradoFichero=1;
					// Escribe el fichero de control de exportacion
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
				} else {GeneradoFichero=0;}
				NumLinea ++;
				///////////////////////////
				/// FIN LECTURA FICHERO //
				///////////////////////////
			} // Fin lectura lineas fichero
			reader.close();
			NumFichero ++;
			// Cuando acaba con el fichero imprime el resto.
			if (NumContratosXfichero>=NumContratos ){
				Utiles.Genera(S15AddGoodsServices, ficheroSalidaXML, NumFichero); // Comentado en pruebas
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
			e.printStackTrace();
		}
		TiempoFinal=fechaFin.getTime();
		//		Utiles.EscribeHoraFileControl(Fichero, TiempoFinal);
		System.out.println("Finalizada extraccion !!!!");	
	}
}
