package huanbao;

import java.util.Date;

public class demo {
	double a;
	double dfjiage;
	double sfjiage;
	String[] name;//�û���ͥ
	int jifen=0;
	double dfpj;
	double sfpj;
	int[] shop;
	
	// ƽ����ˮ��
	public int geta(){
		int b=30;
		double a=b;//B= ÿ����ˮ��
		return (int) (b/a);
	}
	// ƽ���õ���
	public int getb(){
		int b=30;
		double a=b;//B= ÿ���õ���
		return (int) (b/a);
	}
	//���õ���
	public double getc(){
		int b=30;
		double a=getb();
		return  b*a;
	}
	//ÿ����ˮ��
	public double getd(){
		int b=30;
		double a=geta();
		return  b*a;
	}
	//���õ�Ѽ۸�
	public void setdfjiage(double jiage) {
		this.dfjiage = jiage;
		
	}
	//����ˮ�Ѽ۸�
	public void setsfjiage(double jiage){
		this.sfjiage = jiage;
	}
	//�����ļ���ͬ�۸����
	public void siji(String siji){
		switch (siji) {
		case "��":
			setdfjiage(1);
			setsfjiage(1);
			break;
		case "��":
			setdfjiage(2);
			setsfjiage(2);
			break;
		case "��":
			setdfjiage(3);
			setsfjiage(3);
			break;
		case "��":
			setdfjiage(4);
			setsfjiage(4);
			break;
		default:
			System.err.println("ERRO:δ��ȡ������");
			break;
		}
	}
	//����ÿ�µ���ۺ�
	public double gete() {
		double a =getc()*this.dfjiage;
		return a;
		
	}
	//����ÿ��ˮ���ۺ�
	public double getf() {
		double a =getc()*this.sfjiage;
		return a;
	}
	//�ж��û���ͥ���Ϊ�����+1
	public void setjifen(String name){
		for (int i = 0; i < this.name.length; i++) {
			if(this.name[i].equals(name)){
				this.jifen=+1;
			}
		}
	}
	//�������ӻ��ֹ�ʽ
	public void jsjifen(String name){
		//��������С��dfpj���ֵ����+1
		if (getc()<this.dfpj) {
			setjifen(name);
		}
		//ˮ�Ѽ���С��sfpj���ֵ����+1
		if (getd()<this.sfpj) {
			setjifen(name);
		}
	}
	//�ж��Ƿ����ƽ��ˮ��
	public boolean pjsf(){
		double a=0;//ƽ��ˮ�������޷����ýӿ�����a����
		if(a<geta()){
			System.out.println("����ƽ��ˮ��");
			return true;
		}
		else {
			return false;
		}
	}
	//�ж��Ƿ����ƽ������
	public boolean pjdf(){
		double a=0;//ƽ��ˮ�������޷����ýӿ�����a����
		if(a<getb()){
			System.out.println("����ƽ�����");
			return true;
		}
		else {
			return false;
		}
	}
	//ʱ����ʾ
	public String date(){
	       // ��ʼ�� Date ����
	       Date date = new Date();
	        
	       // ʹ�� toString() ������ʾ����ʱ��
	       return "��ǰʱ��"+date.toString();
	}
	public double getqndf(){
		double a = 0;//ȥ����ƽ��ֵ
		return a;
	}
	public double getqnsf(){
		double a = 0;//ȥ��ˮ��ƽ��ֵ
		return a;
	}
	public boolean getpjz(boolean a,int b){
		if (a&&b==1) {
			System.out.println("���ѳ���ȥ��ȫ��ˮ��ƽ��ֵ");
			return true;
		}
		if (a&&b==0) {
			System.out.println("���ѳ���ȥ��ȫ��ƽ��ˮ��");
			return true;
		}
		return false;
	}
	//��������ƽ��Ԥ��
	public void yujing(int b){
		double a = 0;//a���ڵ��ò����ӿ�ʹ��a����
		if(a>geta()&&b==0){
			System.out.println("����ʹ��ˮ���ѳ�������ƽ��ֵ");
		}
		if (a>getb()&&b==1) {
			System.out.println("����ʹ�õ���ѳ�������ƽ��ֵ");
		}
	}
	public double jidu(int b){
		double a = 0;//���ȵ�����ڵ��ò����ӿ�ʹ��a����
		double c = 0;
		if(b==0){
			c = a;
		}
		if (b==1) {
		 c = a;
		}
		return c;
	}
	//���Է���
    public static void main(String[] args) {
		demo a  = new demo();
		a.siji("��");
		a.date();
		System.out.println(a.sfjiage+"|"+a.gete()+"|"+a.getf()+"|"+a.pjsf()+"|"+a.pjdf());
	}
}

