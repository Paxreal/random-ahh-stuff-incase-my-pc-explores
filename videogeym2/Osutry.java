import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Osutry{
    public static boolean modeSecretGOLDENFREDDY = false;
    public static boolean modeKEYBOARDWARRIOR = false;
    public static boolean gamestarted = false;
    public static int points = 0;
    public static int highscore = 0;
    public static double time = 0;
    public static Timer timer;
    public static double holdtime;
    public static int randomx = 1050;
    public static int randomy = 650;
    public static String cpmString;
    public static double holdcpm; public static String holdcpmSTR;


    public static JLabel timecounter = new JLabel("Time: ");
    public static JLabel scorecounter = new JLabel("Score: ");
    public static JLabel highscorecount = new JLabel("Highscore: ");
    public static JLabel cpm = new JLabel();
    public static ImageIcon goldenfrImage = new ImageIcon(new ImageIcon("goldenfreddy.png").getImage().getScaledInstance(1200,800, Image.SCALE_SMOOTH));
    public static ImageIcon biteof87 = new ImageIcon(new ImageIcon("biteof.png").getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH));
    public static JLabel backround = new JLabel();
    public static JFrame frame = new JFrame("Osu! but for paraplegics");
    public static JButton gulo1 = new JButton();
    public static JButton gulo2 = new JButton();
    public static JButton buttonnext = new JButton();
    public static JButton buttonstart = new JButton("Play");
    public static JButton button = new JButton();
    public static JTextField timemuch = new JTextField("10");


    static double Average() {
        return points / time;
    }
    
    static void textcolor(Color what) {
        timecounter.setForeground(what);
        scorecounter.setForeground(what);
        highscorecount.setForeground(what);
        cpm.setForeground(what);
    }
  
    static void modes(int MODE) {
        switch (MODE) {
            case 1 -> {
                backround.setIcon(goldenfrImage);
                frame.setIconImage(goldenfrImage.getImage());  
                textcolor(Color.WHITE);
                timemuch.setText("666");
                button.setSize(50,50);
                buttonnext.setSize(50,50);
                gulo1.setSize(50,50);
                gulo2.setSize(50,50);
                randomx = 1100;
                randomy = 700;
                System.out.println(randomx + " and " + randomy);
            }
            case 2 -> {
            }
        }
                    
    }
    public static void main(String[] args) throws IOException {
        
        
        
            backround.setSize(1200,800);
            backround.setLocation(0,0);


        Scanner $canner = new Scanner("dasave");//////////////////////////////////////////////////////////////
        $canner.close();////////////////////////////////////////////////////////////////////////////////////////////


        
        frame.setDefaultCloseOperation(3);
        frame.setSize(1200,800);
        frame.setResizable(false);
        frame.setLayout(null);

        //JButton buttonstart = new JButton("Play");
            buttonstart.setSize(100,100);
            buttonstart.setLocation(500,300);
            Color buttonstartcolor = buttonstart.getBackground();
            buttonstart.setFocusable(false);


        //JButton button = new JButton();
            button.setSize(100,100);
            button.setLocation(5000,3000);
            button.setFocusable(false);
            button.setBackground(Color.BLUE);


        Font font1 = new Font("Comic Sans MS", Font.BOLD, 20);

        //JButton buttonnext = new JButton();
            buttonnext.setSize(100,100);
            buttonnext.setLocation(button.getLocation());
            buttonnext.setBackground(Color.red);
            buttonnext.setEnabled(false);
            buttonnext.setFocusable(false);

        //JButton gulo1 = new JButton();
            gulo1.setSize(100,100);
            gulo1.setLocation(button.getLocation());
            gulo1.setBackground(Color.CYAN);
            gulo1.setEnabled(false);
            gulo1.setFocusable(false);

        //JButton gulo2 = new JButton();
            gulo2.setSize(100,100);
            gulo2.setLocation(button.getLocation());
            gulo2.setBackground(Color.MAGENTA);
            gulo2.setEnabled(false);
            gulo2.setFocusable(false);
                 
        //JLabel timecounter = new JLabel("Time: ");
            timecounter.setFont(font1);
            timecounter.setLocation(0,0);
            timecounter.setSize(500,20);

        //JLabel scorecounter = new JLabel("Score: ");
            scorecounter.setFont(font1);
            scorecounter.setLocation(0,50);
            scorecounter.setSize(500,20);

        //JLabel highscorecount = new JLabel("Highscore: ");
            highscorecount.setFont(font1);
            highscorecount.setLocation(0,100);
            highscorecount.setSize(500,25);

        JRadioButton modeENDLESS = new JRadioButton("Endless");
            modeENDLESS.setSize(100,30);
            modeENDLESS.setLocation(0,150);
            modeENDLESS.setFont(font1);
            modeENDLESS.setFocusable(false);

        JRadioButton modeTIMER = new JRadioButton("Timer(seconds)",true);
            modeTIMER.setSize(200,30);
            modeTIMER.setLocation(100,150);
            modeTIMER.setFont(font1);
            modeTIMER.setFocusable(false);

        ButtonGroup modegroup = new ButtonGroup();
            modegroup.add(modeTIMER);
            modegroup.add(modeENDLESS);

        //JTextField timemuch = new JTextField("10");
            timemuch.setLocation(0,180);
            timemuch.setSize(300,50);
            timemuch.setFont(font1);


        //JLabel cpm = new JLabel();
            cpm.setFont(font1);
            cpm.setLocation(0,725);
            cpm.setSize(500,25);

        modeENDLESS.addActionListener(((e) -> {
             {timemuch.setText("ENDLESS");}
        }));

        modeTIMER.addActionListener(((e) -> {
            if (((timemuch.getText()).equalsIgnoreCase("THE ONE YOU SHOULDNT HAVE KILLED") || (timemuch.getText()).equalsIgnoreCase("THE ONE YOU SHOULDN'T HAVE KILLED"))
                && (holdcpm >= 3) && (highscore >= 30)
            ) {
                if (!modeSecretGOLDENFREDDY) {
                    modeSecretGOLDENFREDDY = true;
                }

                /* if (modeSecretGOLDENFREDDY) {
                    backround.setIcon(goldenfrImage);
                    frame.setIconImage(goldenfrImage.getImage());  
                    textcolor(Color.WHITE);
                    timemuch.setText("666");
                    button.setSize(50,50);
                    buttonnext.setSize(50,50);
                    gulo1.setSize(50,50);
                    gulo2.setSize(50,50);
                    randomx = 1100;
                    randomy = 700;
                    System.out.println(randomx + " and " + randomy);
                } */
            } else if ((timemuch.getText()).equalsIgnoreCase("normal^0")){
                backround.setIcon(null);
                frame.setIconImage(null);  
                textcolor(Color.black);
                timemuch.setText("10");
                button.setSize(100,100);
                buttonnext.setSize(100,100);
                gulo1.setSize(100,100);
                gulo2.setSize(100,100);
                randomx = 1050;
                randomy = 650;
                System.out.println(randomx +  "and " + randomy);
                modeSecretGOLDENFREDDY = false;
            } else if ((timemuch.getText().equalsIgnoreCase("reset")) && !modeSecretGOLDENFREDDY) {
                highscore = 0;
                holdcpm = 0;
                timecounter.setText("Time: ");
                scorecounter.setText("Score: ");
                highscorecount.setText("Highscore: ");
                cpm.setText("");
                timemuch.setText("10");
                System.out.println(randomx + " and " + randomy);
            } else if ((timemuch.getText().equalsIgnoreCase("bite of 87")) && !modeSecretGOLDENFREDDY){
                backround.setIcon(biteof87);
                frame.setIconImage(biteof87.getImage());
                textcolor(Color.WHITE);
                timemuch.setText("87");
                button.setSize(150,150);
                buttonnext.setSize(150,150);
                gulo1.setSize(150,150);
                gulo2.setSize(150,150);
                randomx = 1000;
                randomy = 600;
                System.out.println(randomx +  " and " + randomy);
                modeSecretGOLDENFREDDY = false;
            } else if (timemuch.getText().equals("keyboard") && !modeSecretGOLDENFREDDY) {

            } else if (modeSecretGOLDENFREDDY) {
                timemuch.setText("666");
            }       
        }));


        frame.add(cpm);
        frame.add(timemuch);
        frame.add(modeTIMER);
        frame.add(modeENDLESS);
        frame.add(highscorecount);
        frame.add(timecounter);
        frame.add(scorecounter);
        frame.add(button);
        frame.add(buttonnext); 
        frame.add(buttonstart);           
        frame.add(gulo1);
        frame.add(gulo2);                 
        frame.add(backround);        

        frame.setVisible(true);
        System.err.println("boom");

        button.addActionListener((e) -> {
            if (gamestarted) {                                
                points++;
                holdtime = time;
                Random random1 = new Random();
                Random random2 = new Random();

                button.setLocation(buttonnext.getLocation());

                int randomint1 = random1.nextInt(randomx);
                int randomint2 = random2.nextInt(randomy);

                buttonnext.setLocation(randomint1, randomint2);

                double length = Math.abs(button.getX() - buttonnext.getX());
                double height = Math.abs(button.getY() - buttonnext.getY());
                double diagonal = (height * height) + (length * length);
                double distance = Math.sqrt(diagonal);
                int distanceINT = (int) distance;
                System.out.println(distanceINT);

                int randomint3 = random1.nextInt(randomx);
                int randomint4 = random2.nextInt(randomy);
                int randomint5 = random1.nextInt(randomx);
                int randomint6 = random2.nextInt(randomy);
                if (modeSecretGOLDENFREDDY){
                    gulo1.setLocation(randomint3,randomint4);
                    gulo2.setLocation(randomint5,randomint6);
                }
                
                if ((time > 0) && (points > 0)) {
                    cpmString = String.format("%.3f", Average());
                    cpm.setText(cpmString);
                    System.out.println("MEAN SA BUTTON: " + cpmString);
                }
                scorecounter.setText("Score: " + points);
            }
        });


        buttonstart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                buttonstart.setBackground(Color.green);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                buttonstart.setBackground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                buttonstart.setBackground(buttonstartcolor);
            }
        });


        buttonstart.addActionListener((e) -> {      
                if (!gamestarted) {
                    if (modeSecretGOLDENFREDDY) {
                        modes(1);
                    }
                    System.out.println(randomx + " and " + randomy);
                    points = 0;                        
                    time = 0;
                    modeENDLESS.setLocation(1000,1500);
                    modeTIMER.setLocation(1000,1500);
                    timemuch.setLocation(1000,1800);
                
                    String stringtimer = Double.toString(time);

                    timecounter.setText("Time: " +stringtimer); 
                        

                    Random r = new Random();
                    Random r0 = new Random();
                            
                    int rint = r.nextInt(randomx);
                    int rint0 = r0.nextInt(randomy);

                    buttonnext.setLocation(rint,rint0);                   
                    button.setLocation(buttonnext.getLocation());   

                    Random twor = new Random();
                    Random two0 = new Random();
        
                    int tworint = twor.nextInt(randomx);
                    int tworint0 = two0.nextInt(randomy);

                    buttonnext.setLocation(tworint,tworint0);

                    buttonstart.setLocation(1000,1000);
                    System.out.println("Button start");  
                    
                    timecounter.setText("Time: "+ 0 + " (" +timemuch.getText()+ ")");

                    gamestarted = true; 

                    timer = new Timer(1000, (y) -> {  
                        time++;                        
                        
                        int holdscore = points;
                        System.err.println(time);     

                        if ((time > 0) && (points > 0)) {

                            cpmString = String.format("%.3f", Average());
                            cpm.setText(cpmString);
                            System.out.println("MEAN SA TIMER: " + cpmString);
                        }

                        String stringtimer2 = String.format("%.0f",time);
                        String timemuchSTR = timemuch.getText();
                            
                        timecounter.setText("Time: "+ stringtimer2 + " (" +timemuchSTR + ")");

                        if (modeTIMER.isSelected()) {
                            try {             
                                int timemuchINT = Integer.parseInt(timemuchSTR);                     
                                if ((timemuchINT == time)) { //this ends the gameplay when the time is up
                                    if (Average() > holdcpm) {
                                        holdcpm = Average();
                                        highscore = points;
                                        holdcpmSTR = String.format("%.3f", holdcpm);
                                        highscorecount.setText("Highscore: " + points + "/("+timemuch.getText()+") [" + holdcpmSTR + "]");            
                                        Files.writeString(Path.of("dasave.txt"), (highscorecount.getText()));                                       
                                    }
                                    points=0;
                                    gamestarted = false;
                                    timer.stop();
                                    button.setLocation(5000,3000);
                                    buttonnext.setLocation(button.getLocation());  
                                    buttonstart.setLocation(500,300);    
                                    holdscore = 0;
                                    holdtime = 0;
                                    modeENDLESS.setLocation(0,150);
                                    modeTIMER.setLocation(100,150);
                                    timemuch.setLocation(0,180);
                                    time=0;
                                    gulo1.setLocation(buttonnext.getLocation());
                                    gulo2.setLocation(button.getLocation());
                                }
                            } catch (IOException | NumberFormatException b) {}
                        } else {
                                //The modeTimer is simply where the time-end-gameplay thingmajig, so without it, it's just endless
                            }
                            
                        if ((points == holdscore) && ((3 + holdtime) == time)) { // then checks if the player is afk or smtn liek that for like, 2-3 seconds
                            if (Average() > holdcpm) {
                                holdcpm = Average();
                                highscore = points;
                                holdcpmSTR = String.format("%.3f", holdcpm);
                                highscorecount.setText("Highscore: " + points + "/("+timemuch.getText()+") [" + holdcpmSTR + "]");
                                try {
                                    Files.writeString(Path.of("dasave.txt"), (highscorecount.getText()));
                                } catch (IOException i ) {}
                            }
                            points = 0;
                            gamestarted = false;
                            timer.stop();
                            button.setLocation(5000,3000);
                            buttonnext.setLocation(button.getLocation());  
                            buttonstart.setLocation(500,300);                                                      
                            holdtime = 0;
                            modeENDLESS.setLocation(0,150);
                            modeTIMER.setLocation(100,150);
                            timemuch.setLocation(0,180);
                            gulo1.setLocation(buttonnext.getLocation());
                            gulo2.setLocation(button.getLocation());
                            
                            time=0;
                        }
                            //System.out.println("This is the hold score " + holdscore);
                            //System.out.println("hoy print "+ holdtime + " ");
                        }       
                        );    
                    timer.start();
                }
        });   

    }
}