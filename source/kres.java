import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class kres {
    private static JFrame janela;
    private static JList<String> lista,lista2,lista3, lista4;
    private static JScrollPane scroll, scroll2, scroll3, scroll4;
    private static JPanel encaps, prim, seg, ter, qua;
    private static JLabel label1,label2;
    private static int v1 = -1,v2 = -1, v3 = -1;
    
    public static void calcular(){
	if((v1 != -1) && (v2 != -2) && (v3 != -1)){
	    String valor = Integer.toString(v1) + Integer.toString(v2);
	    if(v3 == 0){
		label1.setText("ohms: " + valor);
	    }
	    else if(v3 == 1){
		label1.setText("ohms: " + valor + "0");
	    }
	    else if(v3 == 2){
		label1.setText("ohms: " + valor + "00");
	    }
	    else if(v3 == 3){
		label1.setText("ohms: " + valor + "000");
	    }
	    else if(v3 == 4){
		label1.setText("ohms: " + valor + "0000");
	    }
	    else if(v3 == 5){
		label1.setText("ohms: " + valor + "00000");
	    }
	    else if(v3 == 6){
		label1.setText("ohms: " + valor + "000000");
	    }
	    else if(v3 == 7){
		label1.setText("ohms: " + valor + "0000000");
	    }
	    else if(v3 == 8){
		label1.setText("ohms: " + valor);
	    }
	    else if(v3 == 9){
		label1.setText("ohms: " + valor);
	    }
	}
    }
    
    public static void main(String[] args) {
	String[] li = {"preto","marrom","vermelho","laranja","amarelo","verde","azul","violeta","cinza","branco"},
	li2 = {" ","ouro","prata"};
	
	janela = new JFrame("KResColor");
	lista = new JList<String>(li);
	lista2 = new JList<String>(li);
	lista3 = new JList<String>(li);
	lista4 = new JList<String>(li2);
	encaps = new JPanel();
	prim = new JPanel();
	seg = new JPanel();
	ter = new JPanel();
	qua = new JPanel();
	label1 = new JLabel("ohms:        ");
	label2 = new JLabel("tolerancia: 20%");
	
	scroll = new JScrollPane(lista);
	scroll2 = new JScrollPane(lista2);
	scroll3 = new JScrollPane(lista3);
	scroll4 = new JScrollPane(lista4);
	
	janela.setLayout(null);
	janela.setBounds(200,200,560,550);
	janela.setBounds(200,200,460,250);
	janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
	
	scroll.setBounds(10,10,100,100);
	scroll2.setBounds(120,10,100,100);
	scroll3.setBounds(230,10,100,100);
	scroll4.setBounds(340,10,100,100);
	
	encaps.setBounds(30,130,150,50);	
	encaps.setBackground(Color.decode("0xEBC79E"));
	
	prim.setBounds(50,130,20,50);	
	prim.setBackground(Color.decode("0xEBC79E"));
	
	seg.setBounds(80,130,20,50);	
	seg.setBackground(Color.decode("0xEBC79E"));
	
	ter.setBounds(110,130,20,50);	
	ter.setBackground(Color.decode("0xEBC79E"));

	qua.setBounds(140,130,20,50);	
	qua.setBackground(Color.decode("0xEBC79E"));
	
	label1.setBounds(240,130,200,30);
	label2.setBounds(240,160,200,30);
	
	lista.addListSelectionListener(new ListSelectionListener() {
	    @Override
	    public void valueChanged(ListSelectionEvent arg0) {
		if(lista.getSelectedValue() == "preto"){
		    v1 = 0;
		    prim.setBackground(Color.decode("0x000000"));
		}
		else if(lista.getSelectedValue() == "marrom"){
		    v1 = 1;
		    prim.setBackground(Color.decode("0x993300"));
		}
		else if(lista.getSelectedValue() == "vermelho"){
		    v1 = 2;
		    prim.setBackground(Color.decode("0xFF0000"));
		}
		else if(lista.getSelectedValue() == "laranja"){
		    v1 = 3;
		    prim.setBackground(Color.decode("0xff9966"));
		}
		else if(lista.getSelectedValue() == "amarelo"){
		    v1 = 4;
		    prim.setBackground(Color.decode("0xffff66"));
		}
		else if(lista.getSelectedValue() == "verde"){
		    v1 = 5;
		    prim.setBackground(Color.decode("0x009933"));
		}
		else if(lista.getSelectedValue() == "azul"){
		    v1 = 6;
		    prim.setBackground(Color.decode("0x0000ff"));
		}
		else if(lista.getSelectedValue() == "violeta"){
		    v1 = 7;
		    prim.setBackground(Color.decode("0xcc00cc"));
		}
		else if(lista.getSelectedValue() == "cinza"){
		    v1 = 8;
		    prim.setBackground(Color.decode("0x999999"));
		}
		else if(lista.getSelectedValue() == "branco"){
		    v1 = 9;
		    prim.setBackground(Color.decode("0xffffff"));
		}
		calcular();
	    }
	});
	
	lista2.addListSelectionListener(new ListSelectionListener() {
	    @Override
	    public void valueChanged(ListSelectionEvent arg0) {
		if(lista2.getSelectedValue() == "preto"){
		    v2 = 0;
		    seg.setBackground(Color.decode("0x000000"));
		}
		else if(lista2.getSelectedValue() == "marrom"){
		    v2 = 1;
		    seg.setBackground(Color.decode("0x993300"));
		}
		else if(lista2.getSelectedValue() == "vermelho"){
		    v2 = 2;
		    seg.setBackground(Color.decode("0xFF0000"));
		}
		else if(lista2.getSelectedValue() == "laranja"){
		    v2 = 3;
		    seg.setBackground(Color.decode("0xff9966"));
		}
		else if(lista2.getSelectedValue() == "amarelo"){
		    v2 = 4;
		    seg.setBackground(Color.decode("0xffff66"));
		}
		else if(lista2.getSelectedValue() == "verde"){
		    v2 = 5;
		    seg.setBackground(Color.decode("0x009933"));
		}
		else if(lista2.getSelectedValue() == "azul"){
		    v2 = 6;
		    seg.setBackground(Color.decode("0x0000ff"));
		}
		else if(lista2.getSelectedValue() == "violeta"){
		    v2 = 7;
		    seg.setBackground(Color.decode("0xcc00cc"));
		}
		else if(lista2.getSelectedValue() == "cinza"){
		    v2 = 8;
		    seg.setBackground(Color.decode("0x999999"));
		}
		else if(lista2.getSelectedValue() == "branco"){
		    v2 = 9;
		    seg.setBackground(Color.decode("0xffffff"));
		}
		calcular();
	    }
	});
	
	lista3.addListSelectionListener(new ListSelectionListener() {
	    @Override
	    public void valueChanged(ListSelectionEvent arg0) {
		if(lista3.getSelectedValue() == "preto"){
		    v3 = 0;
		    ter.setBackground(Color.decode("0x000000"));
		}
		else if(lista3.getSelectedValue() == "marrom"){
		    v3 = 1;
		    ter.setBackground(Color.decode("0x993300"));
		}
		else if(lista3.getSelectedValue() == "vermelho"){
		    v3 = 2;
		    ter.setBackground(Color.decode("0xFF0000"));
		}
		else if(lista3.getSelectedValue() == "laranja"){
		    v3 = 3;
		    ter.setBackground(Color.decode("0xff9966"));
		}
		else if(lista3.getSelectedValue() == "amarelo"){
		    v3 = 4;
		    ter.setBackground(Color.decode("0xffff66"));
		}
		else if(lista3.getSelectedValue() == "verde"){
		    v3 = 5;
		    ter.setBackground(Color.decode("0x009933"));
		}
		else if(lista3.getSelectedValue() == "azul"){
		    v3 = 6;
		    ter.setBackground(Color.decode("0x0000ff"));
		}
		else if(lista3.getSelectedValue() == "violeta"){
		    v3 = 7;
		    ter.setBackground(Color.decode("0xcc00cc"));
		}
		else if(lista3.getSelectedValue() == "cinza"){
		    v3 = 8;
		    ter.setBackground(Color.decode("0x999999"));
		}
		else if(lista3.getSelectedValue() == "branco"){
		    v3 = 9;
		    ter.setBackground(Color.decode("0xffffff"));
		}
		calcular();
	    }
	});
	
	lista4.addListSelectionListener(new ListSelectionListener() {
	    @Override
	    public void valueChanged(ListSelectionEvent arg0) {
		if(lista4.getSelectedValue() == " "){
		    qua.setBackground(Color.decode("0xEBC79E"));
		    label2.setText("tolerancia: 20%");
		}
		if(lista4.getSelectedValue() == "prata"){
		    qua.setBackground(Color.decode("0xcccccc"));
		    label2.setText("tolerancia: 10%");
		}
		if(lista4.getSelectedValue() == "ouro"){
		    qua.setBackground(Color.decode("0xcccc00"));
		    label2.setText("tolerancia: 5%");
		}
		calcular();
	    }
	});
	
	janela.add(scroll);
	janela.add(scroll2);
	janela.add(scroll3);
	janela.add(scroll4);
	janela.add(prim);
	janela.add(seg);
	janela.add(ter);
	janela.add(qua);
	janela.add(encaps);
	janela.add(label1);
	janela.add(label2);
	
	janela.setVisible(true);
    }
}
