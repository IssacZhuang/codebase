package huanbao;

public class apijifen {
	int[][] a;
	//������Ʒ�ۻ��ֹ���
	public void jifen(int a){
		demo b =new demo();
		b.jifen =-a;
	}
	//�����Ʒ
	public void addshop(int id,int jf){
		demo b =new demo();
		for(int a = 0;b.shop.length<a;a++){
			if(b.shop[a]==0){
				b.shop[a]=id;
				this.a[a][1]=b.shop[a];
				this.a[a][jf]=jf;
			}
		}
	}
	//ɾ����Ʒ
	public void removeshop(int id){
		demo b =new demo();
		for(int a = 0;b.shop.length<a;a++){
			if(b.shop[a]==id){
				b.shop[a]=0;
			}
		}
	}
	//������Ʒ
	public void buyshop(int id,int jf){
		demo b =new demo();
		for(int a = 0;b.shop.length<a;a++){
			if(b.shop[a]==id){
				int jifen = b.jifen-this.a[a][jf];
				if(jifen<0){
					System.err.println("ERRO:��Ļ��ֲ���");
				}
				else{
					shopno();
				}
			}
		}
	}
	public void api(){
		
	}
	//������Ʒ֮�����
	public void shopno(){
	}
	//������д�������
}