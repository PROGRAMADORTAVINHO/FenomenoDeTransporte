package GaussJacobi;

public class GaussJacobi {

    private double [] [] C;
    private double []    D;
    private double[]     Xo;
    private double[]     X;
    
    public GaussJacobi(double[][] matrizExtendida, double [] chuteInicial){

        this.C = new double [matrizExtendida.length][matrizExtendida[0].length];
        this.D = new double [matrizExtendida.length];
        this.Xo = new double[chuteInicial.length];
        this.X = new double[chuteInicial.length];

        manipulaMatrizes(matrizExtendida);

        this.Xo = copiaVetor(chuteInicial);
    }

    private void manipulaMatrizes(double [][] matrizExtendida){
        this.C = copiaMatriz(matrizExtendida);
        for (int nl = 0; nl<C.length;nl++){
            this.D[nl] = this.C[nl][nl];
            this.C[nl][nl] = 0;
        }
    }

    private double[][] copiaMatriz(double [] [] origem){

        double[] [] destino = new double[origem.length][origem[0].length];

        for (int nl = 0 ; nl< origem.length; nl++){
            for (int nc = 0 ; nc< origem.length; nc++){
                destino[nl][nc] = origem[nl][nc];
            } 
        }
        return destino;
    }

    private double[] copiaVetor(double[] origem){
        double[] destino = new double[origem.length];
        for(int nl=0; nl < origem.length; nl++){
            destino[nl] = origem[nl];
        }
        return destino;
    }

    private double calculaLinha(int i){
        
    }
}