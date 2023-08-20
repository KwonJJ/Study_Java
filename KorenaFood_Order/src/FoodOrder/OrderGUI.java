package FoodOrder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class OrderGUI {
	// JPanel속성을 상속받은 이미지 패널 설정, 이미지를 그리는 도구
	@SuppressWarnings("serial")
	static class ImagePanel extends JPanel {
		private Image manual_Img = new ImageIcon(
				"C:\\\\Selfstudyjava\\\\Study_Java\\\\KorenaFood_Order\\\\images\\\\사용설명서.jpg").getImage();

		public ImagePanel(Image manual_Img) {
			this.manual_Img = manual_Img;
		}

		// 그리기 도구 배경화면, 사용서 이미지 그리기
		public void paintComponent(Graphics g) {
			g.drawImage(manual_Img, 1050, 300, 800, 600, null);
		}
	}

	public static void main(String[] args) {
		JFrame fr = new JFrame("한식 메뉴 오더 시스템");
		ImagePanel pn = new ImagePanel(
				new ImageIcon("C:\\selfstudyjava\\Study_Java\\KoreanFood_Orde\\images\\한식당 배경.jpg").getImage());

		fr.pack();
		fr.add(pn);
		JPanel mainPn = new JPanel(); // 메인메뉴 띄우는 패널
		JPanel sidePn = new JPanel(); // 사이드메뉴 띄우는 패널
		JPanel setPn = new JPanel(); // 세트 메뉴 띄오는 패널
		JPanel drinkpn = new JPanel(); // 음료 메뉴 띄오는 페널
		JPanel alcoholPn = new JPanel(); // 주류 메뉴 띄우는 패널

		JTextArea orderTxt = new JTextArea(); // 주문내역

		pn.add(orderTxt);
		// 주문내역을 확인할 수 있는 텍스트 필드를 붙이고 내용 추가
		orderTxt.append("<주문하신 물품을 확인할 수 있습니다.> \n\n");
		orderTxt.setBounds(250, 600, 800, 300);
		// 주문한 내역을 볼 수 있는 txtarea를 생성
		orderTxt.setEditable(false);
		orderTxt.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		JTextArea listTxt = new JTextArea();
		listTxt.setBounds(0, 0, 1300, 400);
		listTxt.setFont(new Font("맑은 고딕", Font.BOLD, 12));

		JButton[] bt = new JButton[6];
		JButton order_bt = new JButton("주문담기");
		
		// 메뉴판 테이블 만들기
        String [] heading = new String[] {"상품명","가격"};
        Object[][] data = new Object [][] {
        	{"상품명", "가격"},
        	{"뚝배기 김치찜", "8,000원"},
        	{"돌솥비빔밥", "7,500원"},
        	{"돌솥소고기콩나물비빔밥", "7,500원"},
        	{"뚝배기 불고기", "8,000원"},
        	{"사골만두국 + 밥 반공기", "7,000원"},
        	{"사골떡만두국 + 밥 반공기", "7,500원"},
        	{"불고기덮밥", "8,000원"},
        	{"삼계탕", "13,000원"},
        	{"철판불고기", "14,000원"},
        	{"수제떡갈비", "12,000원"},
        	{"접시왕만두(4pcs)", "5,000원"},
        	{"김치메밀전병", "6,000원"},
        	{"소주", "4,000원"},
        	{"카스", "4,000원"},
        	{"하이네켄(Heineken)", "8,000원"},
        	{"막걸리 Medium", "4,000원"},
        	{"막걸리 Large", "7,000원"},
        	{"우롱차", "2,000원"},
        	{"콜라", "2,000원"},
        	{"사이다", "2,000원"},
        };
        
        JTable table = new JTable(data,heading);
        pn.add(new JScrollPane(table));
        pn.add(table);
        table.setBounds(250, 300, 800, 600);
        table.setFont(new Font("맑은 고딕",Font.BOLD,30));
        table.setRowHeight(50);
        
      //버튼들 위치와 크기 설정
        int width[]= {300,300,300,300,200,200};
        int height[]= {150,150,150,150,100,100};
        int x[] = {80,480,880,1280,30,30};
        int y[] = {100,100,100,100,300,500};
        
        //이미지 패널 크기설정
        pn.setLayout(null);
        pn.setBounds(0,0,1900,1200);
        // 팔 메뉴 Vector 객체 속에 미리 저장
        MenuSystem.settingMenu();
        
        //메인 버튼 6개 설정
        bt[0] = new JButton("메인메뉴");
        bt[1] = new JButton("사이드메뉴");
        bt[2] = new JButton("세트메뉴");
        bt[3] = new JButton("음료수");
        bt[4] = new JButton("주류");
        bt[5] = new JButton("주문 내역");
        
        for (int i = 0; i < bt.length; i++) {
            pn.add(bt[i]);
            bt[i].setBounds(x[i], y[i], width[i], height[i]);
            // 폰트 설정
            bt[i].setFont(new Font("Blackadder ITC", Font.BOLD, 60));
            //버튼을 투명하게 만들고, 버튼글씨 색상 설정
            bt[i].setContentAreaFilled(false);
            bt[i].setBorderPainted(false);
            bt[i].setFocusPainted(false);
            bt[i].setForeground(Color.WHITE);
        }
        
	}
	
	private void mainMenu() {
		// mainMenu에 생성할 이미지 버튼들 설정
		JButton main_김치찜 = new JButton("");
	}

}
