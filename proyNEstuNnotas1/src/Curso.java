/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Curso {
    public String codCurso;
    public Estudiante [] vecEstu;
    public int tamE;

    public Curso(String codCurso, int ne) {
        this.codCurso = codCurso;
        vecEstu=new Estudiante[ne];
        tamE=0;
    }
    
    public int buscarEstudiante(String ced){
        int posE=-1;
        for(int i=0;i<tamE;i++){
            if(vecEstu[i].getCedula().equals(ced)){
                posE=i;
            }
        }
        return posE;
    }
    
    

     
    
    
    
    public void agregaEstudiante(Estudiante estu){
        vecEstu[tamE]=estu;
        tamE++;
    }
    
    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }
    
    
    
}
