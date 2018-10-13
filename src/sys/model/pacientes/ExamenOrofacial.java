package sys.model.pacientes;
// Generated 17-jul-2018 21:17:55 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ExamenOrofacial generated by hbm2java
 */
public class ExamenOrofacial  implements java.io.Serializable {


     private Integer id;
     private AnalisisOclusion analisisOclusion;
     private Atm atm;
     private ExamenOral examenOral;
     private HallazgosRadiograficos hallazgosRadiograficos;
     private Paciente paciente;
     private Date fecha;
     private String caraForma;
     private String caraLabios;
     private String bordesBermellon;

    public ExamenOrofacial() {
    }

	
    public ExamenOrofacial(Paciente paciente, Date fecha) {
        this.paciente = paciente;
        this.fecha = fecha;
    }
    public ExamenOrofacial(AnalisisOclusion analisisOclusion, Atm atm, ExamenOral examenOral, HallazgosRadiograficos hallazgosRadiograficos, Paciente paciente, Date fecha, String caraForma, String caraLabios, String bordesBermellon) {
       this.analisisOclusion = analisisOclusion;
       this.atm = atm;
       this.examenOral = examenOral;
       this.hallazgosRadiograficos = hallazgosRadiograficos;
       this.paciente = paciente;
       this.fecha = fecha;
       this.caraForma = caraForma;
       this.caraLabios = caraLabios;
       this.bordesBermellon = bordesBermellon;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public AnalisisOclusion getAnalisisOclusion() {
        return this.analisisOclusion;
    }
    
    public void setAnalisisOclusion(AnalisisOclusion analisisOclusion) {
        this.analisisOclusion = analisisOclusion;
    }
    public Atm getAtm() {
        return this.atm;
    }
    
    public void setAtm(Atm atm) {
        this.atm = atm;
    }
    public ExamenOral getExamenOral() {
        return this.examenOral;
    }
    
    public void setExamenOral(ExamenOral examenOral) {
        this.examenOral = examenOral;
    }
    public HallazgosRadiograficos getHallazgosRadiograficos() {
        return this.hallazgosRadiograficos;
    }
    
    public void setHallazgosRadiograficos(HallazgosRadiograficos hallazgosRadiograficos) {
        this.hallazgosRadiograficos = hallazgosRadiograficos;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getCaraForma() {
        return this.caraForma;
    }
    
    public void setCaraForma(String caraForma) {
        this.caraForma = caraForma;
    }
    public String getCaraLabios() {
        return this.caraLabios;
    }
    
    public void setCaraLabios(String caraLabios) {
        this.caraLabios = caraLabios;
    }
    public String getBordesBermellon() {
        return this.bordesBermellon;
    }
    
    public void setBordesBermellon(String bordesBermellon) {
        this.bordesBermellon = bordesBermellon;
    }




}

