package tutorial12;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid = {
				{1,3,5},
				{1,3,4}
		};
		System.out.println(grid[1][1]);
		for (int i = 0 ; i<grid.length;i++) {
			for(int k=0; k<grid[i].length;k++) {
				System.out.print(grid[i][k]);
			}
			System.out.println();
		}
	}

}
