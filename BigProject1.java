//Class:CS163
//Name:Vivek Muppala
//Date:29Th july 2019
//Teacher:Kris Brown
public class BigProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] TeamName = {"TeamIndia","TeamPakistan","TeamSriLanka","TeamBangladesh"};
		double[] AtBats = {1000,980,2001, 1002};
	       double[] Run = {222, 292, 299, 300};
	       double[] Hit = {200, 730, 705, 720};
	       double[] BasesTwo = {300, 300, 304, 308};
	       double[] BasesThree = {100 ,20, 49 ,19};
	       double[] numHomeRuns = {12 , 12 , 99, 88};
	       double[] SingleBase = new double[3];
	       double[] TotalnumBases = new double[3];
	       double[] BattingAverages = new double[3];
	       double maximum = 0;
	       
	       //Basically printing the Table headers in this print statement below
	       System.out.printf("Team Name \tAt Bats \tRuns \t\tHits \t\tSingleBaseHits \tnumTwoBaseHits \tnumThreeBaseHits \tNumHomeRunHits \tTotalnumBases \tBattingAverages\n");
	     
	       // I am calling the methods here for the elements to be passed in from the arrays
	       SingleBase = findSingleBase(Hit, BasesTwo, BasesThree, numHomeRuns);
	       TotalnumBases = TotalNumBases(SingleBase, BasesTwo, BasesThree, numHomeRuns);
	       BattingAverages = BattingAverages(AtBats, Hit);
	       
	       //Using a for loop to print the arrays
	       for (int i = 0; i < TeamName.length; i++) {
	       System.out.printf(TeamName[i] + "\t\t" + (int)AtBats[i] + "\t\t" + (int)Run[i] + "\t\t" + (int)Hit[i] +
	       "\t\t" + (int)SingleBase[i] + "\t\t" + (int)BasesTwo[i] + "\t\t" + (int)BasesThree[i] + "\t\t" + (int)numHomeRuns[i]
	       + "\t\t" + (int)TotalnumBases[i] + "\t\t" + "0." +(int)BattingAverages[i] + "\n");
	       }
	       
	       // I am comparing between the best teams for a particular statistic    
	       maximum = TotalnumBases[0];
	       int BiggestIndex = 0;
	         for (int i = 1; i < TotalnumBases.length; i++) {
	        	 if (TotalnumBases[i] > maximum) {
	        		 maximum = TotalnumBases[i];
	                BiggestIndex = i;
	        	 }       	 
	         }
	         System.out.println("\n" + "Best based on the total number of bases is " + TeamName[BiggestIndex] + " with " + (int)maximum + " bases.");
	         
	         double maximum2 = BattingAverages[0];
	         int BiggestIndexone = 0;
	           for (int i = 1; i < BattingAverages.length; i++) {
	          	 if (BattingAverages[i] > maximum2) {
	          		 maximum2 = BattingAverages[i];
	                   BiggestIndexone = i;
	          	 }
	           }
	           System.out.println("Best team based  on the highest  batting average is " + TeamName[BiggestIndexone] + " with a " + "0." + (int)maximum2 + " batting average.");
	         
	           double maximum3 = numHomeRuns[0];
	           int BiggestIndex2 = 0;
	             for (int i = 1; i < numHomeRuns.length; i++) {
	            	 if (numHomeRuns[i] > maximum3) {
	            		 maximum3 = numHomeRuns[i];
	                     BiggestIndex2 = i;
	            	 }
	             }
	             System.out.println("BestTeam based on homeruns  is " + TeamName[BiggestIndex2] + " with a total of " + (int)maximum3 + " home runs.");
	        
	}     // Method to find single base hits
	       public static double[] findSingleBase (double[] Hits, double[] BasesTwo, double[] BasesThree, double[] HomeRuns) {
	       double[] a = new double[4];
	       for (int i = 0; i < a.length; i++ ) {
	           a[i] = (Hits[i] - BasesTwo[i] - BasesThree[i] - HomeRuns[i]);
	       }
	       return a;
	       }
	       // Method to find total number of bases
	       public static double[] TotalNumBases (double[] a, double[] b, double[] c, double[] d) {
	        double[] f= new double[4];
	        for (int i= 0; i < f.length; i++) {
	           f[i] = (a[i] + (b[i] * 2) + (c[i] * 3) + (d[i] * 4));
	        }
	        return f;
	       
	       }
	       // Method to find the batting average between the teams
	        public static double[] BattingAverages (double[] AtBats, double[] Hit) {
	         double[] b = new double[4];
	             for (int i = 0; i < b.length; i++) {
	              b[i] = ((Hit[i] / AtBats[i]) * 1000);
	              
	              }
	              return b;
	               }
	          
	}


