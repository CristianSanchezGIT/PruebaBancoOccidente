public class Principal {

	
	public String ValidarBus(String cadena) {
		
		//Separar los grupos para acomodar en el bus
		String[] Separa = cadena.split(",");
		
		String BusesFinales = "";
		int CantidadPasajeros = 0;
		int ConteoPasajeros=0;
		int PasajerosLlevados = 0;
		
		try {
			
			for(int a=0; a < Separa.length; a++ ) {
				CantidadPasajeros = CantidadPasajeros+Integer.parseInt(Separa[a]);
			}
			
			for(int bus=1; bus <= CantidadPasajeros; bus++ ) {
				
				//System.out.println("---");
				//System.out.println("LLEGA BUS "+bus);
			
				ConteoPasajeros=0;
				PasajerosLlevados=0;
				
				for(int a=0; a < Separa.length; a++ ) {
					
					if(Integer.parseInt(Separa[a])<=bus) {
						
						//System.out.println("bus "+bus+" puede llevar a "+Integer.parseInt(Separa[a])+ " pasajeros");
						ConteoPasajeros = ConteoPasajeros+Integer.parseInt(Separa[a]);
						
						if(bus == ConteoPasajeros) {
							//Hace viaje
							//System.out.println("Bus "+bus+" lleva hasta el grupo "+(a+1)+" con "+ConteoPasajeros+ " pasajeros");
							//System.out.println("-- Iba "+PasajerosLlevados+" llevados y ahora queda en "+(PasajerosLlevados+bus)+ " llevados");
	
							PasajerosLlevados = PasajerosLlevados+ConteoPasajeros;						
							ConteoPasajeros = 0;
						}else if(ConteoPasajeros>bus) {
							// Quedan puestos vacios
							break;
						}
						
					}else{
						break;
					}
				}
				
				//System.out.println("Alcanzo a llevar a "+PasajerosLlevados + " de "+CantidadPasajeros);
	
				if(PasajerosLlevados == CantidadPasajeros) {
					
					//Validacion para que la primera vez no agregue la,
					if(BusesFinales.equals("")) {
						BusesFinales = String.valueOf(bus);
					}else {
						BusesFinales = BusesFinales+","+bus;
					}
				}
				
			}
			
			
			
		
		} catch (Exception e) {
			System.out.println("EL VALOR INGRESADO NO ES VALIDO");
		}
		return "Response {\"size\":\""+BusesFinales+"\"}";
	}
}
