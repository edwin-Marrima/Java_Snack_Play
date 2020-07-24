import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;
class Janela extends Frame implements KeyListener,ActionListener{
    Button btnIn,btnPlayer,btnPlayer_1,btnPlayer_2,btnPlayer_3,btnPlayer_4,btnPlayer_5,btnPlayer_6,btnPlayer_7,btnPlayer_8,btnPlayer_9,btnPlayer_10,btnPlayer_11,btnPlayer_12,
    btnPlayer_13,btnPlayer_14,btnPlayer_15,btnPlayer_16,btnPlayer_17,btnPlayer_18,btnPlayer_19,btnPlayer_20,food;
    TextField pontuacao;
    Label label;
    Graphics g;
   Color cor;
   Random aleatorio ;
 
    public Janela(){
       
        setLayout(null);
        pontuacao = new TextField("0");
        pontuacao.setVisible(false);
        btnIn = new Button("Iniciar");
        btnIn.addActionListener(this);
        btnIn.setBounds(250,50,50,20);
        add(btnIn);
        aleatorio = new Random();
        btnPlayer = new Button("...");
        btnPlayer_1 = new Button("...");
        btnPlayer_2 = new Button("...");
        btnPlayer_3 = new Button("...");
        btnPlayer_4 = new Button("...");
        btnPlayer_5 = new Button("...");
        btnPlayer_6 = new Button("...");
        btnPlayer_7 = new Button("...");
        btnPlayer_8 = new Button("...");
        btnPlayer_9 = new Button("...");
        btnPlayer_10 = new Button("...");
        btnPlayer_11 = new Button("...");
        btnPlayer_12 = new Button("...");
        btnPlayer_13 = new Button("...");
        btnPlayer_14 = new Button("...");
        btnPlayer_15 = new Button("...");
        btnPlayer_16 = new Button("...");
        btnPlayer_17 = new Button("...");
        btnPlayer_18 = new Button("...");
        btnPlayer_19 = new Button("...");
        btnPlayer_20 = new Button("...");

        food = new Button("...");
       
        btnPlayer.setBounds(332,100,10,10);
        btnPlayer_1.setBounds(320,100,10,10);
        btnPlayer_2.setBounds(308,100,10,10);
        btnPlayer_3.setBounds(296,100,10,10);
        btnPlayer_4.setBounds(284,100,10,10);
        btnPlayer_5.setBounds(272,100,10,10);
        food.setBounds(200,200,10,10);
        btnPlayer.setBackground(Color.RED);
        btnPlayer_1.setBackground(Color.BLACK);
        btnPlayer_2.setBackground(Color.BLACK);
        btnPlayer_3.setBackground(Color.BLACK);
        btnPlayer_4.setBackground(Color.BLACK);
        btnPlayer_5.setBackground(Color.BLACK);
        btnPlayer_6.setBackground(Color.BLACK);
        btnPlayer_7.setBackground(Color.BLACK);
        btnPlayer_8.setBackground(Color.BLACK);
        btnPlayer_9.setBackground(Color.BLACK);
        btnPlayer_10.setBackground(Color.BLACK);
        btnPlayer_11.setBackground(Color.BLACK);
        btnPlayer_12.setBackground(Color.BLACK);
        btnPlayer_13.setBackground(Color.BLACK);
        btnPlayer_14.setBackground(Color.BLACK);
        btnPlayer_15.setBackground(Color.BLACK);
        btnPlayer_16.setBackground(Color.BLACK);
        btnPlayer_17.setBackground(Color.BLACK);
        btnPlayer_18.setBackground(Color.BLACK);
        btnPlayer_19.setBackground(Color.BLACK);
        btnPlayer_20.setBackground(Color.BLACK);
        food.setBackground(Color.GREEN);

        label = new Label("Infelizmente voce Perdeu...");
        label.setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC,30));
        label.setBounds(30,100,500,100);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnIn){
            g = getGraphics();
            g.setColor(Color.WHITE);
        g.fillRect(30, 80, 517, 248);
        btnIn.setVisible(false);
        add(btnPlayer);
        add(btnPlayer_1);
        add(btnPlayer_2);
        add(btnPlayer_3);
        add(btnPlayer_4);
        
        add(food);
         btnPlayer.addKeyListener(this);
        }
    }

    public void keyTyped(KeyEvent k){

    }
   
    public void keyPressed(KeyEvent k){
         
      int boss=0;
        int posicao=0;
        int[] posicaoFood = new int[2];
        int[] posicaoX = new int[21];
        int[] posicaoY = new int[21];
      
         int x = food.getX();
        int y= food.getY();
        posicaoX[0] = btnPlayer.getX();
        posicaoX[1] = btnPlayer_1.getX();
        posicaoX[2] = btnPlayer_2.getX();
        posicaoX[3] = btnPlayer_3.getX();
        posicaoX[4] = btnPlayer_4.getX();
        posicaoX[5] = btnPlayer_5.getX();
        posicaoX[6] = btnPlayer_6.getX();
        posicaoX[7] = btnPlayer_7.getX();
        posicaoX[8] = btnPlayer_8.getX();
        posicaoX[9] = btnPlayer_9.getX(); 
        posicaoX[10] = btnPlayer_10.getX();
        posicaoX[11] = btnPlayer_11.getX();
        posicaoX[12] = btnPlayer_12.getX();
        posicaoX[13] = btnPlayer_13.getX();
        posicaoX[14] = btnPlayer_14.getX();
        posicaoX[15] = btnPlayer_15.getX();
        posicaoX[16] = btnPlayer_16.getX();
        posicaoX[17] = btnPlayer_17.getX();
        posicaoX[18] = btnPlayer_18.getX();
        posicaoX[19] = btnPlayer_19.getX();
        posicaoX[20] = btnPlayer_20.getX();


        posicaoY[0]  = btnPlayer.getY();
        posicaoY[1]  = btnPlayer_1.getY();
        posicaoY[2]  = btnPlayer_2.getY();
        posicaoY[3]  = btnPlayer_3.getY();
        posicaoY[4]  = btnPlayer_4.getY();
        posicaoY[5] = btnPlayer_5.getY();
        posicaoY[6] = btnPlayer_6.getY();
        posicaoY[7] = btnPlayer_7.getY();
        posicaoY[8] = btnPlayer_8.getY();
        posicaoY[9] = btnPlayer_9.getY(); 
        posicaoY[10] = btnPlayer_10.getY();
        posicaoY[11] = btnPlayer_11.getY();
        posicaoY[12] = btnPlayer_12.getY();
        posicaoY[13] = btnPlayer_13.getY();
        posicaoY[14] = btnPlayer_14.getY();
        posicaoY[15] = btnPlayer_15.getY();
        posicaoY[16] = btnPlayer_16.getY();
        posicaoY[17] = btnPlayer_17.getY();
        posicaoY[18] = btnPlayer_18.getY();
        posicaoY[19] = btnPlayer_19.getY();
        posicaoY[20] = btnPlayer_20.getY();

       // setTitle(posicaoY[0]+" ");
        if(posicaoX[0]<32 || posicaoX[0]>536 || posicaoY[0]<88 || posicaoY[0]>316){
           add(label);
           btnIn.setVisible(true);
        }
        if((posicaoX[0]>=x && posicaoX[0]<=x+9) && (posicaoY[0]>=y && posicaoY[0]<=y+9)){
             posicaoFood=posicaoRandom();
            food.setBounds(posicaoFood[0],posicaoFood[1],10,10);

            int pont = Integer.parseInt(pontuacao.getText());
            pont = pont+50;
            pontuacao.setText(Integer.toString(pont));
            setTitle("Score: "+Integer.toString(pont));
            tamanho(pont);
            
        }


        if(k.getKeyCode()==37){
            btnPlayer.setBounds(posicaoX[0]-12,posicaoY[0],10,10);
            btnPlayer_1.setBounds(posicaoX[0],posicaoY[0],10,10);
            btnPlayer_2.setBounds(posicaoX[1],posicaoY[1],10,10);
            btnPlayer_3.setBounds(posicaoX[2],posicaoY[2],10,10);
            btnPlayer_4.setBounds(posicaoX[3],posicaoY[3],10,10);
            btnPlayer_5.setBounds(posicaoX[4],posicaoY[4],10,10);
            btnPlayer_6.setBounds(posicaoX[5],posicaoY[5],10,10);
            btnPlayer_7.setBounds(posicaoX[6],posicaoY[6],10,10);
            btnPlayer_8.setBounds(posicaoX[7],posicaoY[7],10,10);
            btnPlayer_9.setBounds(posicaoX[8],posicaoY[8],10,10);
            btnPlayer_10.setBounds(posicaoX[9],posicaoY[9],10,10);
            btnPlayer_11.setBounds(posicaoX[10],posicaoY[10],10,10);
            btnPlayer_12.setBounds(posicaoX[11],posicaoY[11],10,10);
            btnPlayer_13.setBounds(posicaoX[12],posicaoY[12],10,10);
            btnPlayer_14.setBounds(posicaoX[13],posicaoY[13],10,10);
            btnPlayer_15.setBounds(posicaoX[14],posicaoY[14],10,10);
            btnPlayer_16.setBounds(posicaoX[15],posicaoY[15],10,10);
            btnPlayer_17.setBounds(posicaoX[16],posicaoY[16],10,10);
            btnPlayer_18.setBounds(posicaoX[17],posicaoY[17],10,10);
            btnPlayer_19.setBounds(posicaoX[18],posicaoY[18],10,10);
            btnPlayer_20.setBounds(posicaoX[19],posicaoY[19],10,10);
        }
        else if(k.getKeyCode()==38){
            btnPlayer.setBounds(posicaoX[0],posicaoY[0]-12,10,10);
            btnPlayer_1.setBounds(posicaoX[0],posicaoY[0],10,10);
            btnPlayer_2.setBounds(posicaoX[1],posicaoY[1],10,10);
            btnPlayer_3.setBounds(posicaoX[2],posicaoY[2],10,10);
            btnPlayer_4.setBounds(posicaoX[3],posicaoY[3],10,10);
            btnPlayer_5.setBounds(posicaoX[4],posicaoY[4],10,10);
            btnPlayer_6.setBounds(posicaoX[5],posicaoY[5],10,10);
            btnPlayer_7.setBounds(posicaoX[6],posicaoY[6],10,10);
            btnPlayer_8.setBounds(posicaoX[7],posicaoY[7],10,10);
            btnPlayer_9.setBounds(posicaoX[8],posicaoY[8],10,10);
            btnPlayer_10.setBounds(posicaoX[9],posicaoY[9],10,10);
            btnPlayer_11.setBounds(posicaoX[10],posicaoY[10],10,10);
            btnPlayer_12.setBounds(posicaoX[11],posicaoY[11],10,10);
            btnPlayer_13.setBounds(posicaoX[12],posicaoY[12],10,10);
            btnPlayer_14.setBounds(posicaoX[13],posicaoY[13],10,10);
            btnPlayer_15.setBounds(posicaoX[14],posicaoY[14],10,10);
            btnPlayer_16.setBounds(posicaoX[15],posicaoY[15],10,10);
            btnPlayer_17.setBounds(posicaoX[16],posicaoY[16],10,10);
            btnPlayer_18.setBounds(posicaoX[17],posicaoY[17],10,10);
            btnPlayer_19.setBounds(posicaoX[18],posicaoY[18],10,10);
            btnPlayer_20.setBounds(posicaoX[19],posicaoY[19],10,10);
        }
        else if(k.getKeyCode()==39){
            btnPlayer.setBounds(posicaoX[0]+12,posicaoY[0],10,10);
            btnPlayer_1.setBounds(posicaoX[0],posicaoY[0],10,10);
            btnPlayer_2.setBounds(posicaoX[1],posicaoY[1],10,10);
            btnPlayer_3.setBounds(posicaoX[2],posicaoY[2],10,10);
            btnPlayer_4.setBounds(posicaoX[3],posicaoY[3],10,10);
            btnPlayer_5.setBounds(posicaoX[4],posicaoY[4],10,10);
            btnPlayer_6.setBounds(posicaoX[5],posicaoY[5],10,10);
            btnPlayer_7.setBounds(posicaoX[6],posicaoY[6],10,10);
            btnPlayer_8.setBounds(posicaoX[7],posicaoY[7],10,10);
            btnPlayer_9.setBounds(posicaoX[8],posicaoY[8],10,10);
            btnPlayer_10.setBounds(posicaoX[9],posicaoY[9],10,10);
            btnPlayer_11.setBounds(posicaoX[10],posicaoY[10],10,10);
            btnPlayer_12.setBounds(posicaoX[11],posicaoY[11],10,10);
            btnPlayer_13.setBounds(posicaoX[12],posicaoY[12],10,10);
            btnPlayer_14.setBounds(posicaoX[13],posicaoY[13],10,10);
            btnPlayer_15.setBounds(posicaoX[14],posicaoY[14],10,10);
            btnPlayer_16.setBounds(posicaoX[15],posicaoY[15],10,10);
            btnPlayer_17.setBounds(posicaoX[16],posicaoY[16],10,10);
            btnPlayer_18.setBounds(posicaoX[17],posicaoY[17],10,10);
            btnPlayer_19.setBounds(posicaoX[18],posicaoY[18],10,10);
            btnPlayer_20.setBounds(posicaoX[19],posicaoY[19],10,10);
        }
        else if(k.getKeyCode()==40){
           
            btnPlayer.setBounds(posicaoX[0],posicaoY[0]+12,10,10);
            btnPlayer_1.setBounds(posicaoX[0],posicaoY[0],10,10);
            btnPlayer_2.setBounds(posicaoX[1],posicaoY[1],10,10);
            btnPlayer_3.setBounds(posicaoX[2],posicaoY[2],10,10);
            btnPlayer_4.setBounds(posicaoX[3],posicaoY[3],10,10);
            btnPlayer_5.setBounds(posicaoX[4],posicaoY[4],10,10);
            btnPlayer_6.setBounds(posicaoX[5],posicaoY[5],10,10);
            btnPlayer_7.setBounds(posicaoX[6],posicaoY[6],10,10);
            btnPlayer_8.setBounds(posicaoX[7],posicaoY[7],10,10);
            btnPlayer_9.setBounds(posicaoX[8],posicaoY[8],10,10);
            btnPlayer_10.setBounds(posicaoX[9],posicaoY[9],10,10);
            btnPlayer_11.setBounds(posicaoX[10],posicaoY[10],10,10);
            btnPlayer_12.setBounds(posicaoX[11],posicaoY[11],10,10);
            btnPlayer_13.setBounds(posicaoX[12],posicaoY[12],10,10);
            btnPlayer_14.setBounds(posicaoX[13],posicaoY[13],10,10);
            btnPlayer_15.setBounds(posicaoX[14],posicaoY[14],10,10);
            btnPlayer_16.setBounds(posicaoX[15],posicaoY[15],10,10);
            btnPlayer_17.setBounds(posicaoX[16],posicaoY[16],10,10);
            btnPlayer_18.setBounds(posicaoX[17],posicaoY[17],10,10);
            btnPlayer_19.setBounds(posicaoX[18],posicaoY[18],10,10);
            btnPlayer_20.setBounds(posicaoX[19],posicaoY[19],10,10);
           
            
        }
    }
    public void keyReleased(KeyEvent k){

    }
   public int[] posicaoRandom(){
       int y=100;
       int x =32;
             int[] retorno = new int[2];
             int[] vetorX = new int[43];
             int[] vetorY = new int [18];
                for(int i=0;i<43;i++){
                    vetorX[i] = x;
                    x=x+12;
                }
                for(int j=1;j<18;j++){
                    vetorY[j] = y;
                    y=y+12;
                }
                int a = aleatorio.nextInt(43)+1;
                int b = aleatorio.nextInt(18)+1;
                retorno[0]=vetorX[a];
                retorno[1]=vetorY[b];
                return retorno; 
   }
    
    public void tamanho(int score){
        if(score==100){
            add(btnPlayer_5);
        }else if(score==100){
            add(btnPlayer_5);
        }
        else if(score==200){
            add(btnPlayer_6);
        }
        else if(score==300){
            add(btnPlayer_7);
        }
        else if(score==400){
            add(btnPlayer_8);
        }
        else if(score==500){
            add(btnPlayer_9);
        }
        else if(score==600){
            add(btnPlayer_10);
        }
        else if(score==1000){
            add(btnPlayer_11);
        }
        else if(score==1200){
            add(btnPlayer_12);
        }else if(score==1300){
            add(btnPlayer_13);
        }
        else if(score==1400){
            add(btnPlayer_14);
        }else if(score==1600){
            add(btnPlayer_14);
        }else if(score==1700){
            add(btnPlayer_15);
        }
        else if(score==1800){
            add(btnPlayer_16);
        }else if(score==1900){
            add(btnPlayer_17);
        }else if(score==2100){
            add(btnPlayer_18);
        }else if(score==2200){
            add(btnPlayer_19);
        }else if(score==2400){
            add(btnPlayer_20);
        }

    }
}

class TesteKeyL{
    public static void main(String[] args) {
        Color cor = new Color (250,240,210);
        Janela janela = new Janela();
        janela.setSize(600,400);
        janela.setVisible(true);
        janela.setBackground(cor);



    }


}