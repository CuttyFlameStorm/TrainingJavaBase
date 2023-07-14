package App;

import java.util.Date;

public abstract class Appel {
	protected int numero;
	protected Date dateAppel;
	protected double dureeAppel;
	//un appel concerne un contact
	protected Contact contact;
	
	//pour chaque appel on aura besoin de connaitre le coup
//	quand on a une méthode abstraite à l'intérieur de la class, la class elle meme doit etre abstraite
	//methode
	public abstract double cout();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDateAppel() {
		return dateAppel;
	}

	public void setDateAppel(Date dateAppel) {
		this.dateAppel = dateAppel;
	}

	public double getDureeAppel() {
		return dureeAppel;
	}

	public void setDureeAppel(double dureeAppel) {
		this.dureeAppel = dureeAppel;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Appel() {
		super();
	}

	public Appel(int numero, Date dateAppel, double dureeAppel) {
		super();
		this.numero = numero;
		this.dateAppel = dateAppel;
		this.dureeAppel = dureeAppel;
		
	}
	
}
