
public class JumpingOnTheClouds {

	public static void main(String[] args) {
		// int c[] = {0, 0, 1, 0, 0, 1, 0};
		 int c[] = {0, 0, 0, 0, 1, 0};
		//int c[]= {0, 0, 0, 0,0,0,1, 0,1,0};
		//int c[]= {0, 0, 0, 1, 0, 0};
		int jump=0;
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]==0) {
				count=count+1;
				
			}else {
				if(count==1) {
					jump=jump+1;
				}else if(count==2) {
					jump=jump+2;
				}else if(count==3){
					jump=jump+2;
				}else {
					if(count>5) {
					int rm=count%3;
					if(rm==0) {
						jump=jump+(count/3)+2;
					}else if(rm==1) {
						jump=jump+(count/3)+3;
					}else if(rm==2) {
						jump=jump+(count/3)+3;
					}
					}else {
					int rm=count%3;
					//System.out.println(rm+" : "+count/3);
					if(rm==0) {
						jump=jump+(count/3)+1;
					}else if(rm==1) {
						jump=jump+(count/3)+2;
					}else if(rm==2) {
						jump=jump+(count/3)+2;
					}
					}
				}
				count=0;
			}
			
			
		}
		if(count!=0) {
			if(count==1) {
				jump=jump+1-1;
			}else if(count==2) {
				jump=jump+2-1;
			}else if(count==3){
				jump=jump+2-1;
			}else {
				int rm=count%3;
				if(rm==0) {
					jump=jump+(count/3)+1-1;
				}else if(rm==1) {
					jump=jump+(count/3)+2-1;
				}else if(rm==2) {
					jump=jump+(count/3)+2-1;
				}
			}
			count=0;
		}
		System.out.println(jump);

	}

}
