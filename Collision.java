import java.awt.*;


public class Collision{
    int[][] ballBoxVert = new int[2][4];
    boolean[] intersections = new boolean[2]
    Area ballArea;
    Area PaddlePrime;
    Area PaddleSecundus;
    
    public boolean collisionTest(Ball gameBall, Paddle paddle1, Paddle paddle2){
        AreaDefinitions(paddle1, paddle2, gameBall);
        
        return !ballArea.isEmpty();
        
    }

    
    public void BallBoxVertMethod(Ball gameBall){
        ballBoxVert[0][0] = gameBall.xBall - 30;
        ballBoxVert[1][0] = gameBall.xBall + 30;
        ballBoxVert[2][0] = gameBall.xBall - 30;
        ballBoxVert[3][0] = gameBall.xBall + 30;
        
        ballBoxVert[0][1] = gameBall.yBall - 30;
        ballBoxVert[1][1] = gameBall.yBall + 30;
        ballBoxVert[2][1] = gameBall.yBall - 30;
        ballBoxVert[3][1] = gameBall.yBall + 30;
           
    }
    
    public void AreaDefinitions(Paddle paddle1, Paddle paddle2, Ball gameBall){
        int[] ballX = new int[4];
        int[] ballY = new int[4];

        
        
        BallBoxVertMethod(gameBall);
        
        for(int a = 0; a < 2; ++a){
            for(int i = 0; i < 4; ++i){
                
                if(a == 0){
                    ballX[i] = ballBoxVert[a][i];
                }
                
                else if(a == 1){
                    ballY[i] = ballBoxVert[a][i];                               
                }
                
                else{
                    break;
                }
            }
        }

        
        Polygon ball = new Polygon(ballX[], ballY[], 4);
        Area ballArea = new Area(ball);
        
        
        
        
        int[] PaddleOneX = new int[2];
        int[] PaddleOneY = new int[2];

        PaddleOneX[0] = paddle1.x1;
        PaddleOneX[1] = paddle1.x2;
        
        PaddleOneY[0] = paddle1.y1;
        PaddleOneY[1] = paddle1.y2;
        
        Polygon paddleOne = new Polygon(PaddleOneX, PaddleOneY, 2);
        PaddlePrime = Area(paddleOne);
        
        
        
        
        
        int[] PaddleTwoX = new int[2];
        int[] PaddleTwoY = new int[2];

        PaddleTwoX[0] = paddle2.x1;
        PaddleTwoX[1] = paddle2.x2;
        
        PaddleTwoY[0] = paddle2.y1;
        PaddleTwoY[1] = paddle2.y2;
        
        paddleTwo = Polygon(PaddleTwoX, PaddleTwoY, 2);
        PaddleSecundus = Area(paddleTwo);
    }
    
    
    
}
