package com.onsr.accidents.business;

public class caract�ristiques_route {
	
	
	private int codec;
	private boolean pav�;
	
	public caract�ristiques_route()
	{
		
		
	}
	public boolean isPav�() {
		return pav�;
	}
	public void setPav�(boolean pav�) {
		this.pav� = pav�;
	}
	public boolean isNonpav�() {
		return nonpav�;
	}
	public void setNonpav�(boolean nonpav�) {
		this.nonpav� = nonpav�;
	}
	public boolean isRoutemal() {
		return routemal;
	}
	public void setRoutemal(boolean routemal) {
		this.routemal = routemal;
	}
	public boolean isTraveaux() {
		return traveaux;
	}
	public void setTraveaux(boolean traveaux) {
		this.traveaux = traveaux;
	}
	public String getLargeurmetres() {
		return largeurmetres;
	}
	public void setLargeurmetres(String largeurmetres) {
		this.largeurmetres = largeurmetres;
	}
	public int getCodec() {
		return codec;
	}
	public void setCodec(int codec) {
		this.codec = codec;
	}
	private boolean nonpav�;
	private boolean routemal;
	private boolean traveaux;
	private String largeurmetres;

}
