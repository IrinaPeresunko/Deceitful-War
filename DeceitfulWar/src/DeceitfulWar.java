
//Problem D.Deceitful War
//Google Code Jam

public class DeceitfulWar {

	public static void sorting(double[] NaomiBlocks,double[] KenBlocks,int countOfBlocks){
		for(int j=0;j<countOfBlocks;j++){
		for(int i=0;i<countOfBlocks-1;i++){
			if(NaomiBlocks[i]>NaomiBlocks[i+1]){
				double temp=NaomiBlocks[i];
				NaomiBlocks[i]=NaomiBlocks[i+1];
				NaomiBlocks[i+1]=temp;
			}
			if(KenBlocks[i]>KenBlocks[i+1]){
				double temp=KenBlocks[i];
				KenBlocks[i]=KenBlocks[i+1];
				KenBlocks[i+1]=temp;
			}
		}
		}
	}
	public static int getPointsInWar(double[] NaomiBlocks,double[] KenBlocks,int countOfBlocks){
		int pointsInWar=0,count=0;
		for(int i=0,j=0;i<countOfBlocks&&j<countOfBlocks;i++,j++){
			if(NaomiBlocks[i]<KenBlocks[j]){
				count++;
				continue;
			}
			else{
				while(NaomiBlocks[i]>KenBlocks[j] && j<countOfBlocks){
				 j++;
				 if(NaomiBlocks[i]<KenBlocks[j]){
					 count++;
						break;
				 }
				}
			}
		}
		pointsInWar=countOfBlocks-count;
		return pointsInWar;
	}
	public static int getPointsInDeceitfulWar(double[] NaomiBlocks,double[] KenBlocks,int countOfBlocks){
		int count=0,pointsInDeceitfulWar=0;
		for(int i=0;i<countOfBlocks;i++){
			if((NaomiBlocks[i]<KenBlocks[i]) && KenBlocks[i]!=-1){
				count++;
				KenBlocks[countOfBlocks-count]=-1;
			}
		}
		pointsInDeceitfulWar=countOfBlocks-count;;
		return pointsInDeceitfulWar;
	}
	public static void main(String[] args) {
		
		int pointsInDeceitfulWar=0;
		int pointsInWar=0;
		
		double[] NaomiBlocks1={0.5};
		double[] KenBlocks1={0.6};
		int countOfBlocks=NaomiBlocks1.length;
        pointsInWar=getPointsInWar(NaomiBlocks1,KenBlocks1,countOfBlocks);
		pointsInDeceitfulWar=getPointsInDeceitfulWar(NaomiBlocks1,KenBlocks1,countOfBlocks);
		System.out.println("Case #1: "+pointsInDeceitfulWar+" "+pointsInWar);
		
		double[] NaomiBlocks2={0.7,0.2};
		double[] KenBlocks2={0.8,0.3};
		countOfBlocks=NaomiBlocks2.length;
		sorting(NaomiBlocks2,KenBlocks2,countOfBlocks);
		pointsInWar=getPointsInWar(NaomiBlocks2,KenBlocks2,countOfBlocks);
		pointsInDeceitfulWar=getPointsInDeceitfulWar(NaomiBlocks2,KenBlocks2,countOfBlocks);
		System.out.println("Case #2: "+pointsInDeceitfulWar+" "+pointsInWar);

		double[] NaomiBlocks3={0.5,0.1,0.9};
		double[] KenBlocks3={0.6,0.4,0.3};
		countOfBlocks=NaomiBlocks3.length;
		sorting(NaomiBlocks3,KenBlocks3,countOfBlocks);
		pointsInWar=getPointsInWar(NaomiBlocks3,KenBlocks3,countOfBlocks);
		pointsInDeceitfulWar=getPointsInDeceitfulWar(NaomiBlocks3,KenBlocks3,countOfBlocks);
		System.out.println("Case #3: "+pointsInDeceitfulWar+" "+pointsInWar);
		
		double[] NaomiBlocks4={0.186,0.389,0.907,0.832,0.959,0.557,0.300,0.992,0.899};
		double[] KenBlocks4={0.916,0.728,0.271,0.520,0.700,0.521,0.215,0.341,0.458};
		countOfBlocks=NaomiBlocks4.length;
		sorting(NaomiBlocks4,KenBlocks4,countOfBlocks);
		pointsInWar=getPointsInWar(NaomiBlocks4,KenBlocks4,countOfBlocks);
		pointsInDeceitfulWar=getPointsInDeceitfulWar(NaomiBlocks4,KenBlocks4,countOfBlocks);
		System.out.println("Case #4: "+pointsInDeceitfulWar+" "+pointsInWar);
	}
}
