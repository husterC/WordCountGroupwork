package WordCount;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener{  
	
    private static final long serialVersionUID = 1L;  
  
    public static File filePath = null;
    public static String Path = null;
    JButton btn = null;  
    JButton choose =null;
  
    JTextField textField = null;  
  
    public Main(){  
        this.setTitle("选择文件窗口");  
        FlowLayout layout = new FlowLayout();// 布局  
        JLabel label = new JLabel("请选择文件：");// 标签  
        textField = new JTextField(30);// 文本域  
        btn = new JButton("浏览");// 钮1 
        choose = new JButton("选择");
  
        // 设置布局  
        layout.setAlignment(FlowLayout.LEFT);// 左对齐  
        this.setLayout(layout);  
        this.setBounds(400, 200, 600, 70);  
        this.setVisible(true);  
        this.setResizable(false);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        btn.addActionListener(this);  
        choose.addActionListener(this); 
        this.add(label);  
        this.add(textField);  
        this.add(btn);  
        this.add(choose);

    }  
  
    public static void main(String[] args){  
    	if(args.length == 0){
    		System.out.println("无输入");
    	}
    	else if(args.length != 1){
    		System.out.println("just one file name");
    	}
    	else if(args.length == 1){
    		if(args[0].equals("-x")) {
    			new Main();
    			return;
    		}
    		String filetype = null;
    		filetype = args[0].substring(args[0].length()-3,args[0].length());
    		if(!filetype.equals("txt")){
    			System.out.printf("must be txt type file");
    		}
    		else{
    			ArrayList<String> inFile = new ArrayList<String>();
    			inFile = Input.Input(args[0]);
    			String[][] outFile = null;
    			outFile = WordFrequency.wordFrequency(inFile);
    			ListSort.quickSort(outFile, 0, outFile.length - 1);
    			File f = new File("outFile.txt");
    			Output.Output(outFile,f);
    		}
    	}
    }  
  
    @Override  
    public void actionPerformed(ActionEvent e){ 
    	if(e.getSource() == btn){
    		JFileChooser chooser = new JFileChooser();  
    		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);  
    		chooser.showDialog(new JLabel(), "选择");  
    		filePath = chooser.getSelectedFile(); 
    		textField.setText(filePath.getAbsoluteFile().toString());
    	}
    	if(e.getSource() == choose){
    		Path = textField.getText();
    		ArrayList<String> inFile = new ArrayList<String>();
    		inFile = Input.Input(Path);
    		String[][] outFile = null;
    		outFile = WordFrequency.wordFrequency(inFile);
    		ListSort.quickSort(outFile, 0, outFile.length - 1);
    		File f = new File("outFile.txt");
    		Output.Output(outFile,f);
    	}
    }  
}  