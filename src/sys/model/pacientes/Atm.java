package sys.model.pacientes;
// Generated 17-jul-2018 21:17:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Atm generated by hbm2java
 */
public class Atm  implements java.io.Serializable {


     private Integer id;
     private String crepitacion;
     private String sensibilidad;
     private String dolor;
     private String subluxacion;
     private String habitosTension;
     private String tamanoLengua;
     private String torusMaxilar;
     private String torusMandibular;
     private String desviacion;
     private String desviacionApertura;
     private String desviacionCierre;
     private String maxilarU;
     private String maxilarV;
     private String maxilarAfilado;
     private String mandibularU;
     private String mandibularV;
     private String mandibularAfilado;
     private Set<ExamenOrofacial> examenOrofacials = new HashSet<ExamenOrofacial>(0);

    public Atm() {
    }

	
    public Atm(String crepitacion, String sensibilidad, String dolor, String subluxacion, String habitosTension, String tamanoLengua, String torusMaxilar, String desviacion) {
        this.crepitacion = crepitacion;
        this.sensibilidad = sensibilidad;
        this.dolor = dolor;
        this.subluxacion = subluxacion;
        this.habitosTension = habitosTension;
        this.tamanoLengua = tamanoLengua;
        this.torusMaxilar = torusMaxilar;
        this.desviacion = desviacion;
    }
    public Atm(String crepitacion, String sensibilidad, String dolor, String subluxacion, String habitosTension, String tamanoLengua, String torusMaxilar, String torusMandibular, String desviacion, String desviacionApertura, String desviacionCierre, String maxilarU, String maxilarV, String maxilarAfilado, String mandibularU, String mandibularV, String mandibularAfilado, Set<ExamenOrofacial> examenOrofacials) {
       this.crepitacion = crepitacion;
       this.sensibilidad = sensibilidad;
       this.dolor = dolor;
       this.subluxacion = subluxacion;
       this.habitosTension = habitosTension;
       this.tamanoLengua = tamanoLengua;
       this.torusMaxilar = torusMaxilar;
       this.torusMandibular = torusMandibular;
       this.desviacion = desviacion;
       this.desviacionApertura = desviacionApertura;
       this.desviacionCierre = desviacionCierre;
       this.maxilarU = maxilarU;
       this.maxilarV = maxilarV;
       this.maxilarAfilado = maxilarAfilado;
       this.mandibularU = mandibularU;
       this.mandibularV = mandibularV;
       this.mandibularAfilado = mandibularAfilado;
       this.examenOrofacials = examenOrofacials;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCrepitacion() {
        return this.crepitacion;
    }
    
    public void setCrepitacion(String crepitacion) {
        this.crepitacion = crepitacion;
    }
    public String getSensibilidad() {
        return this.sensibilidad;
    }
    
    public void setSensibilidad(String sensibilidad) {
        this.sensibilidad = sensibilidad;
    }
    public String getDolor() {
        return this.dolor;
    }
    
    public void setDolor(String dolor) {
        this.dolor = dolor;
    }
    public String getSubluxacion() {
        return this.subluxacion;
    }
    
    public void setSubluxacion(String subluxacion) {
        this.subluxacion = subluxacion;
    }
    public String getHabitosTension() {
        return this.habitosTension;
    }
    
    public void setHabitosTension(String habitosTension) {
        this.habitosTension = habitosTension;
    }
    public String getTamanoLengua() {
        return this.tamanoLengua;
    }
    
    public void setTamanoLengua(String tamanoLengua) {
        this.tamanoLengua = tamanoLengua;
    }
    public String getTorusMaxilar() {
        return this.torusMaxilar;
    }
    
    public void setTorusMaxilar(String torusMaxilar) {
        this.torusMaxilar = torusMaxilar;
    }
    public String getTorusMandibular() {
        return this.torusMandibular;
    }
    
    public void setTorusMandibular(String torusMandibular) {
        this.torusMandibular = torusMandibular;
    }
    public String getDesviacion() {
        return this.desviacion;
    }
    
    public void setDesviacion(String desviacion) {
        this.desviacion = desviacion;
    }
    public String getDesviacionApertura() {
        return this.desviacionApertura;
    }
    
    public void setDesviacionApertura(String desviacionApertura) {
        this.desviacionApertura = desviacionApertura;
    }
    public String getDesviacionCierre() {
        return this.desviacionCierre;
    }
    
    public void setDesviacionCierre(String desviacionCierre) {
        this.desviacionCierre = desviacionCierre;
    }
    public String getMaxilarU() {
        return this.maxilarU;
    }
    
    public void setMaxilarU(String maxilarU) {
        this.maxilarU = maxilarU;
    }
    public String getMaxilarV() {
        return this.maxilarV;
    }
    
    public void setMaxilarV(String maxilarV) {
        this.maxilarV = maxilarV;
    }
    public String getMaxilarAfilado() {
        return this.maxilarAfilado;
    }
    
    public void setMaxilarAfilado(String maxilarAfilado) {
        this.maxilarAfilado = maxilarAfilado;
    }
    public String getMandibularU() {
        return this.mandibularU;
    }
    
    public void setMandibularU(String mandibularU) {
        this.mandibularU = mandibularU;
    }
    public String getMandibularV() {
        return this.mandibularV;
    }
    
    public void setMandibularV(String mandibularV) {
        this.mandibularV = mandibularV;
    }
    public String getMandibularAfilado() {
        return this.mandibularAfilado;
    }
    
    public void setMandibularAfilado(String mandibularAfilado) {
        this.mandibularAfilado = mandibularAfilado;
    }
    public Set<ExamenOrofacial> getExamenOrofacials() {
        return this.examenOrofacials;
    }
    
    public void setExamenOrofacials(Set<ExamenOrofacial> examenOrofacials) {
        this.examenOrofacials = examenOrofacials;
    }




}


