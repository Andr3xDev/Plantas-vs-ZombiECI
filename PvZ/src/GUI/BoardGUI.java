package GUI;

import GUI.extras.BackgroundImage;
import GUI.extras.BackgroundSound;
import GUI.extras.BoardBox;
import GUI.extras.BoardConf;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


/**
 * Class that represents the Game's Board GUI. It contains all the elements of the game, such as
 * the plants, zombies, bullets, etc.
 */
public class BoardGUI extends JFrame implements Runnable {
    //! Missing keylistener and this attributes
    private BoardBox boardBox;           // Singleton que maneja la lógica del juego

    //** Attributes **//

    // Dimensions
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int ROWS = 5;
    private static final int COLS = 11;

    // Panels
    JPanel plantsPanel = new JPanel();
    JPanel zombiesPanel = new JPanel();
    JPanel boardPanel = new BoardConf("PvZ/assets/background/board.jpg");
    JPanel infoPanel = new JPanel();

    // Game elements
    private GameAPP app;
    private String gameMode;
    private BoardBox[][] boxes;
    private JLabel timerLabel;
    private int remainingTime;
    private boolean shovelMode;
    private JLabel sunsLabel;
    private JLabel brainLabel;
    private String selectedPlant;
    private String selectedZombie;




    /**
     * Constructor, creates the Game's elements and actions.
     */
    public BoardGUI(GameAPP app) {
        this.app = app;
        this.boxes = new BoardBox[ROWS][COLS];
        prepareElements();
    }




    //** Prepare Elements **//

    /**
     * Prepares all basic elements of the Game GUI.
     */
    private void prepareElements() {
        // Window actions
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        // Window properties
        setTitle("POOB vs Zombies");
        setSize(screenSize);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Prepare all Elements
        prepareElementsBoard();
        prepareElementsPlayers();
        prepareElementsInfo();
        prepareElementsOthers();

        // Add Panels
        add(plantsPanel, BorderLayout.WEST);
        add(zombiesPanel, BorderLayout.EAST);
        add(infoPanel, BorderLayout.NORTH);
    }


    private void prepareElementsBoard() {
        boardPanel.setLayout(new GridLayout(ROWS, COLS));
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                boxes[i][j] = new BoardBox(i,j);
                boardPanel.add(boxes[i][j]);
            }
        }

        boardPanel.setBorder(new EmptyBorder(
                screenSize.height/9,
                screenSize.width/8 + 5,
                screenSize.height/19,
                screenSize.width/8
        ));
        add(boardPanel, BorderLayout.CENTER);
    }

    private void prepareElementsPlayers() {

        //* Plants Panel
        plantsPanel.setLayout(new GridLayout(7, 1));
        plantsPanel.setPreferredSize(new Dimension(screenSize.width/9, screenSize.height/2));
        plantsPanel.setBackground(new Color(2, 0, 51, 200));
        plantsPanel.setBorder(BorderFactory.createLineBorder(new Color(2, 0, 51), 8));

        // Elements
        plantsPanel.add(new JLabel("Plants"));
        plantsPanel.add(new JLabel("Suns"));
        plantsPanel.add(new JButton("Sunflower"));
        plantsPanel.add(new JButton("Peashooter"));
        plantsPanel.add(new JButton("Wallnut"));
        plantsPanel.add(new JButton("Cherrybomb"));
        plantsPanel.add(new JButton("Snowpea"));
        add(plantsPanel, BorderLayout.WEST);


        //* Zombies Panel
        zombiesPanel.setLayout(new GridLayout(7, 1));
        zombiesPanel.setPreferredSize(new Dimension(screenSize.width/9, screenSize.height/2));
        zombiesPanel.setBackground(new Color(2, 0, 51, 200));
        zombiesPanel.setBorder(BorderFactory.createLineBorder(new Color(2, 0, 51), 8));

        // Elements
        zombiesPanel.add(new JLabel("Zombies"));
        zombiesPanel.add(new JLabel("Brains"));
        zombiesPanel.add(new JButton("Zombie"));
        zombiesPanel.add(new JButton("Conehead"));
        zombiesPanel.add(new JButton("Buckethead"));
        zombiesPanel.add(new JButton("Brainstain"));
        zombiesPanel.add(new JButton("Football"));
        add(zombiesPanel, BorderLayout.EAST);
    }

    private void prepareElementsOthers() {
        JPanel refillPanel = new JPanel();
        refillPanel.setPreferredSize(new Dimension(screenSize.width, screenSize.height/7));
        refillPanel.setBackground(new Color(2, 0, 51, 200));
        refillPanel.setBorder(BorderFactory.createLineBorder(new Color(2, 0, 51), 8));
        add(refillPanel, BorderLayout.SOUTH);
    }

    private void prepareElementsInfo() {
        infoPanel.setLayout(new GridLayout(1, 3));
        infoPanel.setPreferredSize(new Dimension(screenSize.width, screenSize.height/7));
        infoPanel.setBackground(new Color(2, 0, 51, 200));
        infoPanel.setBorder(BorderFactory.createLineBorder(new Color(2, 0, 51), 8));

        // Elements
        timerLabel = new JLabel("Time: 0");
        sunsLabel = new JLabel("Points: 0");
        brainLabel = new JLabel("points: 0");
        infoPanel.add(timerLabel);
        infoPanel.add(sunsLabel);
        infoPanel.add(brainLabel);
    }





    //** Update Elements **//

    private void updatePlayers() {
    }

    private void updateZombies() {
    }

    private void updateBullets() {
    }

    private void updateSuns() {
    }

    private void updateBrains() {
    }



    //** Paint Elements **//

    public void run() {
        //! Missing to implement the game loop
        /*try {
               while (!juego.gameOver() && !juego.finished()) {
                   actualizar();
                    actualizarBloques();
                    cargaNivel();
                    Thread.sleep(3000);
                    quitarNivel();
                    while (!juego.nivelAcabado() && !juego.gameOver()) {
                        if (!juego.enPausa()) {
                            if (juego.creoBola()) Thread.sleep(1000);
                            juego.mover();
                            if (juego.actualizarBloques()) {
                                actualizarBloques();
                            }
                            actualizar();
                        }
                    }
                }
                terminar(juego.gameOver());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
    }

}