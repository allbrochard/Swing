package Swing1er;

  import java.awt.Color;
   import java.awt.event.MouseAdapter;
   import java.awt.event.MouseEvent;
   import java.awt.event.ActionListener;
   import java.awt.event.ActionEvent;
   import javax.swing.JFrame;
   import javax.swing.JRadioButtonMenuItem;
  import javax.swing.JPopupMenu;
  import javax.swing.ButtonGroup;
 
  public class Popup extends JFrame
  {
     private JRadioButtonMenuItem items[];
     private final Color colorValues[] =
        { Color.BLUE, Color.YELLOW, Color.RED };
     private JPopupMenu popupMenu;
 
     public Popup()
     {
        super( "Exemple JPopupMenus" );
 
        ItemHandler handler = new ItemHandler();
        String colors[] = { "Bleu", "Jaune", "Rouge" }; 
 
        ButtonGroup colorGroup = new ButtonGroup();
        popupMenu = new JPopupMenu();
        items = new JRadioButtonMenuItem[ 3 ]; 
 
        for ( int count = 0; count < items.length; count++ )
        {
           items[ count ] = new JRadioButtonMenuItem( colors[ count ] );
           popupMenu.add( items[ count ] );
           colorGroup.add( items[ count ] );
           items[ count ].addActionListener( handler );
        } 
 
        setBackground( Color.WHITE ); 
 
        addMouseListener(
 
           new MouseAdapter()
           {
 
              public void mousePressed( MouseEvent event )
              {
                 checkForTriggerEvent( event );
              } 
 
              public void mouseReleased( MouseEvent event )
              {
                 checkForTriggerEvent( event );
              } 
 
              private void checkForTriggerEvent( MouseEvent event )
              {
                 if ( event.isPopupTrigger() )
                    popupMenu.show(
                       event.getComponent(), event.getX(), event.getY() );
              }
           }
        );
        setSize(200,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     } 
 
     private class ItemHandler implements ActionListener
     {
 
       public void actionPerformed( ActionEvent event )
        {
 
           for ( int i = 0 ; i < items.length; i++ )
           {
              if ( event.getSource() == items[ i ] )
              {
                 getContentPane().setBackground( colorValues[ i ] );
                 return;
              }
           }
        }
     }
     	public static void main (String[] args)
     		{
     			new Popup().setVisible(true);
            }
  }