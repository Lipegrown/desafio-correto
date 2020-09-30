package model.entities;

import java.io.Serializable;

public class Mainview implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer jogo;
	
	private Integer placar;
	
	private Integer minimoTemporada;
	
	private Integer maximoTemporada;
	
	private Integer minimoRecord;
	
	private Integer maximoRecord;

	public Mainview(Integer jogo, Integer placar, Integer minimoTemporada, Integer maximoTemporada,
			Integer minimoRecord, Integer maximoRecord) {
		super();
		this.jogo = jogo;
		this.placar = placar;
		this.minimoTemporada = minimoTemporada;
		this.maximoTemporada = maximoTemporada;
		this.minimoRecord = minimoRecord;
		this.maximoRecord = maximoRecord;
	}

	public Integer getJogo() {
		return jogo;
	}

	public void setJogo(Integer jogo) {
		this.jogo = jogo;
	}

	public Integer getPlacar() {
		return placar;
	}

	public void setPlacar(Integer placar) {
		this.placar = placar;
	}

	public Integer getMinimoTemporada() {
		return minimoTemporada;
	}

	public void setMinimoTemporada(Integer minimoTemporada) {
		this.minimoTemporada = minimoTemporada;
	}

	public Integer getMaximoTemporada() {
		return maximoTemporada;
	}

	public void setMaximoTemporada(Integer maximoTemporada) {
		this.maximoTemporada = maximoTemporada;
	}

	public Integer getMinimoRecord() {
		return minimoRecord;
	}

	public void setMinimoRecord(Integer minimoRecord) {
		this.minimoRecord = minimoRecord;
	}

	public Integer getMaximoRecord() {
		return maximoRecord;
	}

	public void setMaximoRecord(Integer maximoRecord) {
		this.maximoRecord = maximoRecord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jogo == null) ? 0 : jogo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mainview other = (Mainview) obj;
		if (jogo == null) {
			if (other.jogo != null)
				return false;
		} else if (!jogo.equals(other.jogo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mainview [jogo=" + jogo + ", placar=" + placar + ", minimoTemporada=" + minimoTemporada
				+ ", maximoTemporada=" + maximoTemporada + ", minimoRecord=" + minimoRecord + ", maximoRecord="
				+ maximoRecord + "]";
	}
	
	
	
	

}
