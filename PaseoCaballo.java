/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class PaseoCaballo {
    
    static final int N = 8;
    static final int n = (N+1);
    private int [][] Tablero = new int [n][n];
    private boolean exito;
    private int [][] salto = {{2,1}, {1, 2}, {-1,2}, {-2,1}, {-2,-1}, {-1,-2}, {1,-2}, {2,-1}};
    private int x0, y0;
    
    
    public PaseoCaballo (int x, int y) throws Exception{
        
        if ((y<1) || (y>N) || (x<1) || (x>N)){
        throw new Exception("Coordenadas fuera de rango");
        }
        
        x0 = x;
        y0= y;
        
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                Tablero[i][j]=0;
            }
        }
        
        Tablero [x0][y0] = 1;
        exito = false;
    }
    
    public boolean ResolverProblema(){
        
        PaseodeCaballo (x0, y0, 2);
        return exito;
    }
    
    private void PaseodeCaballo (int x, int y, int i){
        int nx, ny;
        int k;
        k = 0;
        
        do {
            k ++;
            nx = x + salto [k-1][0];
            ny = y + salto [k-1][1];
            
            if ((nx >= 1) && (nx <= N) && (ny >= 1) && (ny <= N) && (Tablero[nx][ny]==0)){
                
                Tablero [nx][ny] = i;
                
                if (i < N * N){
                    PaseodeCaballo(nx, ny, i + 1);
                    
                    if (!exito){
                        Tablero[nx][ny] = 0;
                    }
                }
                else {
                    exito = true;
                }
            }
        
       
        }while ((k<8) && !exito );
  }
    void EscribirTablero(){
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                System.out.print(Tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}

