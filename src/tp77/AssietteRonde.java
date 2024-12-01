package tp77;

public class AssietteRonde extends Assiette {

    private double rayon;



    public AssietteRonde(int annee,double rayon) {

        super(annee);

        this.rayon=rayon;

    }

    public double calculerSurface() {

        return Math.PI*rayon*rayon;

    }



 

}

