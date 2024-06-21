
public class Curso extends Conteudo {


    // @Override
    // public double calcularXp() {
    //     // TODO Auto-generated method stub
    //     return XP_PADRAO * cargaHoraria; 
    // }

    

private String cargaHoraria;

@Override
public double calcularXp() {
    // TODO Auto-generated method stub
    return 0;
}
public String getCargaHoraria() {
    return cargaHoraria;
}
public void setCargaHoraria(String string) {
    this.cargaHoraria = string;
}

@Override
public String toString() {
    return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
}

}



