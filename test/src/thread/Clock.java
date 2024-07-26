package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 24.07.22(월) 스레드와 AWT 사용하여 시계 구현
 * @author 홍재헌
 *
 */
public class Clock extends Frame implements Runnable{

    public Clock() {
//		setSize(300, 400);
        setBounds(800, 400, 300, 400);
        setVisible(true);
        setFont(new Font("Consolas", Font.BOLD, 25));
        setForeground(new Color(255, 255, 0));
        setBackground(new Color(213, 150, 242));
        Thread t = new Thread(this);
        t.start();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("클릭됐다");
                System.exit(0);				//강제 종료
            }
        });
    }

    @Override
    public void run() {
        while(true) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //	Call Back 함수
    @Override
    public void paint(Graphics g) {	//Frame에 그려준다
        SimpleDateFormat sd = new SimpleDateFormat("HH : mm : ss");
        Date date = new Date();
        g.drawString(sd.format(date), 70, 100);
    }

    public static void main(String[] args) {
        new Clock();	//Frame이 생성되고, paint() 호출
    }

}
