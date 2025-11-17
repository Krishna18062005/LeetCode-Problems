class Solution {
    public int orangesRotting(int[][] gr) {
        int c=0;
		
		while(!isAllRiped(gr)) {
			c++;
			int[][] cp=cpy(gr);
			if(!makeRipe(cp,gr)) {break;}
			gr=cpy(cp);
		}
        return (isAllRiped(gr))?c:-1;
    }
    static int[][] cpy(int[][] or) {
		int[][] rs=new int[or.length][or[0].length];
		for(int i=0;i<or.length;i++) {
			for(int j=0;j<or[0].length;j++) {
				rs[i][j]=or[i][j];
			}
		}
		return rs;
	}
	public static boolean makeRipe(int[][] cp,int[][] gr) {
		boolean f=false;
		int r=cp.length;
		int c=cp[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(gr[i][j]==2) {
					if(rote(cp,i,j)) f=true;
					
				}
			}			
		}
		return f;
	}
	public static boolean rote(int[][] cp,int i,int j) {
		boolean f=true;
		if(i+1<cp.length) {
			if(cp[i+1][j]==1) {cp[i+1][j]+=1;f=false;}
		}
		if(i-1>=0) {
			if(cp[i-1][j]==1) {cp[i-1][j]+=1;f=false;}
		}
		if(j+1<cp[0].length) {
			if(cp[i][j+1]==1) { cp[i][j+1]+=1;f=false;}
		}
		if(j-1>=0) {
			if(cp[i][j-1]==1) {cp[i][j-1]+=1;f=false;}
		}
		return !f;
	}
	public static boolean isAllRiped(int[][] gr) {
		int r=gr.length;
		int c=gr[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(gr[i][j]==1) {
					return false;
				}
			}			
		}
		return true;
	}
}