package zad;

public class SiecNeuronowa {
    double[][] vektoryTestowe = {
            {0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0},//0
            {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},//0r
            {0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0},//0rr
            {1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0},//0rrr
            {0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0},//1
            {0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0},//1r
            {0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0},//1rr
            {1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0},//2
            {1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0},//2r
            {1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0},//3
            {1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},//3r
            {1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0},//4
            {1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0},//4r
            {1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0},//4rr
            {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0},//5
            {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},//5r
            {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0},//6
            {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},//6r
            {1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0},//7
            {1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0},//7r
            {0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0},//8
            {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},//8r
            {0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0},//9
            {1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0}//9r
    };
    double[][] odpOczekiwane = {
            {0.0,0.0,0.0,0.0},//0
            {0.0,0.0,0.0,0.0},//0
            {0.0,0.0,0.0,0.0},//0
            {0.0,0.0,0.0,0.0},//0
            {0.0,0.0,0.0,1.0},//1
            {0.0,0.0,0.0,1.0},//1
            {0.0,0.0,0.0,1.0},//1
            {0.0,0.0,1.0,0.0},//2
            {0.0,0.0,1.0,0.0},//2
            {0.0,0.0,1.0,1.0},//3
            {0.0,0.0,1.0,1.0},//3
            {0.0,1.0,0.0,0.0},//4
            {0.0,1.0,0.0,0.0},//4
            {0.0,1.0,0.0,0.0},//4
            {0.0,1.0,0.0,1.0},//5
            {0.0,1.0,0.0,1.0},//5
            {0.0,1.0,1.0,0.0},//6
            {0.0,1.0,1.0,0.0},//6
            {0.0,1.0,1.0,1.0},//7
            {0.0,1.0,1.0,1.0},//7
            {1.0,0.0,0.0,0.0},//8
            {1.0,0.0,0.0,0.0},//8
            {1.0,0.0,0.0,1.0},//9
            {1.0,0.0,0.0,1.0}//9
    };
    int kodowanie = 4;
    static double[][] wagiUkryte ;
    static double[][] wagiWyjscie;
    double[][] odpNeuronu ;
    double[][] ukryteY;
    double[][] bledWyjscia;
    double[][] bledUkryty;
    double alfa = 0.3;
    int[] wynik = new int[2];
    static Window window;

    /**
     * FORMULY:
     *  Exw = (d - y) * f'(NET) = (d - y) * alfa * (f(NET) * ( 1 - f(NET))
     *  Exu = Sum (wi * Ei) * f'(NET)
     *  W'x = Wx + alfa * Ex * x
     *  b'x = bx + alfa * Ex
     */

    public SiecNeuronowa(){
        wagiWyjscie = new double[kodowanie][15];
        wagiUkryte = new double[iloscNeuronuw()][25];
        System.out.println(wagiUkryte.length + "  " + wagiWyjscie.length);

        ukryteY = new double[vektoryTestowe.length][wagiUkryte.length];
        odpNeuronu = new double[odpOczekiwane.length][kodowanie];

        bledUkryty = new double[vektoryTestowe.length][iloscNeuronuw()];
        bledWyjscia = new double[vektoryTestowe.length][wagiWyjscie.length];
        randomWagi();
        wynik[0]=uczenie();
        window = new Window();
        
        showRoznicu();
}


    public int iloscNeuronuw(){
        return ((vektoryTestowe.length + wagiWyjscie.length) /2);
    }
    public int iloscNeuronuwDwa(){
        return (int) Math.sqrt(vektoryTestowe.length + wagiWyjscie.length);
    }
    public int uczenie(){
        int epok=0;
        do{
            epok++;
            for(int i=0;i<vektoryTestowe.length;i++){
                for(int j=0;j<wagiUkryte.length; j++){
                    double net = 0;
                    for(int m=0; m<wagiUkryte[j].length-1; m++){
                        net+= wagiUkryte[j][m] * vektoryTestowe[i][m];
                    }
                    net+=wagiUkryte[j][24];
                    ukryteY[i][j] = wartoscY(net);
                }
                for(int u=0; u<wagiWyjscie.length; u++){
                    double netY=0;
                    for(int k=0; k< wagiWyjscie[u].length-1;k++){
                        netY+=wagiWyjscie[u][k] * ukryteY[i][k];
                    }
                    netY+=wagiWyjscie[u][wagiWyjscie.length-1];
                    odpNeuronu[i][u] = wartoscY(netY);
                }
            }

            bledyNeuronuw();
            noweWagi();
            double E = wyliczanieBleduSieci();
            System.out.println(E);
            if(E<=0.01)
                break;
        }while(true);
        showBledy();
        System.out.println("Epok: "  + epok);
        return epok;
    }
    public double wyliczanieBleduSieci(){
        // E = 1/2 * sum[vekttest]sum(d - u)^2
        double E=0;
        for(int i=0; i<odpOczekiwane.length; i++){
            double Ew =0;
            for(int j=0;j<odpOczekiwane[i].length; j++){
                Ew += Math.pow(odpOczekiwane[i][j] - odpNeuronu[i][j], 2);
            }
            E+=Ew;
        }
        E/=2;
        return E;
    }

    public void noweWagi(){
        for(int i=0; i< vektoryTestowe.length; i++){
            for(int j=0; j<wagiUkryte.length; j++){
                for(int k=0; k< wagiUkryte[j].length-1; k++){
                    wagiUkryte[j][k]+= (bledUkryty[i][j] * vektoryTestowe[i][k] * alfa);
                }
                wagiUkryte[j][24] += (bledUkryty[i][j] * alfa);
            }

            for(int u=0;u<wagiWyjscie.length; u++){
                for(int m=0; m<wagiWyjscie[u].length-1; m++){
                    wagiWyjscie[u][m]+= (bledWyjscia[i][u] * ukryteY[i][m] * alfa);
                }
                wagiWyjscie[u][wagiWyjscie[u].length-1]+= (bledWyjscia[i][u] * alfa);
            }

        }
    }

    public void bledyNeuronuw(){
        //wyjscia
        for(int i=0;i<odpOczekiwane.length; i++){
            for(int j=0; j<odpOczekiwane[i].length; j++){
                bledWyjscia[i][j] = (odpOczekiwane[i][j] - odpNeuronu[i][j]) * odpNeuronu[i][j] * (1 - odpNeuronu[i][j]);
//                bledWyjscia[i][j] = (odpOczekiwane[i][j] - odpNeuronu[i][j]) * 1/2 * (1 - Math.pow(odpNeuronu[i][j],2));
            }
        }

        //ukryte
        for(int i=0; i<vektoryTestowe.length; i++){
            for(int j=0; j<wagiUkryte.length; j++){
                double suma =0;
                for(int k=0; k<wagiWyjscie.length; k++){
                    suma+= wagiWyjscie[k][j] * bledWyjscia[i][k];
                }
                suma*= (ukryteY[i][j] * (1 - ukryteY[i][j]));
//                suma*= 1/2 * (1 - Math.pow(ukryteY[i][j],2));
                bledUkryty[i][j] = suma;
            }
        }
    }

    public void showBledy(){
        for(int i=0; i<odpNeuronu.length;i++){
            System.out.println();
            for(int j=0; j< odpNeuronu[i].length; j++)
                System.out.print(odpNeuronu[i][j] + " ");
        }
    }
    public void showRoznicu(){
        System.out.println(wynik[0] + " - " + wynik[1]);
    }

    public static double wartoscY(double net){
        return (1/(1+Math.pow(Math.E,-net)));
//        return (2/(1+Math.pow(Math.E,-net)))-1;
    }


    public void randomWagi(){
        //ukryte:
        for(int i=0; i<wagiUkryte.length; i++)
            for(int j=0; j< wagiUkryte[i].length; j++)
                wagiUkryte[i][j] = Math.random();

        //wyjscie
        for(int i=0; i<wagiWyjscie.length; i++)
            for(int j=0; j< wagiWyjscie[i].length; j++)
                wagiWyjscie[i][j] = Math.random();


    }

    public static void main(String[] args) {
        new SiecNeuronowa();
    }

    public static void valiczanieWyniku(double[] liczba) {
        double[] ukryte= new double[14];
        double[] wyjscie = new double[4];

        for(int i=0; i< wagiUkryte.length; i++){
            double net = 0;
            for(int j=0; j< wagiUkryte[i].length-1; j++){
                net+= wagiUkryte[i][j] * liczba[j];
            }
            net+=wagiUkryte[i][24];
            ukryte[i] = wartoscY(net);
        }

        for(int i=0; i<wagiWyjscie.length; i++){
            double netY=0;
            for(int j=0; j<wagiWyjscie[i].length-1; j++){
                netY+= wagiWyjscie[i][j] * ukryte[j];
            }
            netY+=wagiWyjscie[i][14];
            wyjscie[i] = wartoscY(netY);
        }

        int wynik=0;
        for(int i=0; i<wyjscie.length; i++){
            System.out.println(wyjscie[i] + " * 2^"+(wyjscie.length-i-1));
            wynik+=((int)(wyjscie[i]+0.2)) * Math.pow(2,(wyjscie.length-i-1));
            System.out.println((wyjscie.length-i-1));
        }
        System.out.println(wynik);
        window.jTextArea.setText(String.valueOf(wynik));
    }
}
