package ������;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class GUI���� extends JFrame{
	GUI����()
	{
		JTextField inPut=new JTextField(20);
		JTextField outPut=new JTextField(20);
		JPanel uppart=new JPanel();
		uppart.add(new JLabel("����:"));
		uppart.add(inPut);
		JPanel downpart=new JPanel();
		downpart.add(new JLabel("���:"));
		downpart.add(outPut);
		JPanel keyspart=new JPanel();
		keyspart.setLayout(new GridLayout(5,4));
		
		JButton ans=new JButton("ANS");keyspart.add(ans);
		JButton ac=new JButton("AC");keyspart.add(ac);
		JButton clr=new JButton("CLR");keyspart.add(clr);
		JButton ��=new JButton("^");keyspart.add(��);
		
		JButton _9=new JButton("9");keyspart.add(_9);
		JButton _8=new JButton("8");keyspart.add(_8);
		JButton _7=new JButton("7");keyspart.add(_7);
		JButton ��=new JButton("+");keyspart.add(��);
		
		JButton _6=new JButton("6");keyspart.add(_6);
		JButton _5=new JButton("5");keyspart.add(_5);
		JButton _4=new JButton("4");keyspart.add(_4);
		JButton ��=new JButton("-");keyspart.add(��);
		
		JButton _3=new JButton("3");keyspart.add(_3);
		JButton _2=new JButton("2");keyspart.add(_2);
		JButton _1=new JButton("1");keyspart.add(_1);
		JButton ��=new JButton("*");keyspart.add(��);
		
		JButton _0=new JButton("0");keyspart.add(_0);
		JButton ��=new JButton(".");keyspart.add(��);
		JButton ��=new JButton("=");keyspart.add(��);
		JButton ��=new JButton("/");keyspart.add(��);
		
		
		this.setLayout(new FlowLayout());
		this.add(uppart);
		this.add(downpart);
		this.add(keyspart);
		this.setSize(500, 300);
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
