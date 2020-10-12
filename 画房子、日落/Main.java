

public class Main 
{
    public static void main (String [] args){
        //练习1-1：创建一个圆，然后创建一个正方形
/*        Circle circle1 = new Circle ();
        Square square1 = new Square();
        
         circle1.makeVisible(); //出现一个窗口，中间一个蓝色圆
*/         
        //练习1-2：如果调用moveDown两次或三次会发生什么情况？如果连续调用makeInvisible两次呢？  
/*        circle1.moveDown();     //蓝色圆高度下降
          circle1.moveDown();       //蓝色圆高度再次下降
          circle1.makeInvisible();   //蓝色圆消失
          circle1.makeInvisible();  //窗口无变化（空白）
 */
        //练习1-3：试着调用moveVertical、slowMoveVertical和changeSize方法，看看如何能用moveHorizontal将这个圆向左移70个像素。
/*        circle1.moveHorizontal(-70);//圆左移70像素
 */
        //练习1-4：调用changeColor方法，改变圆的颜色
/*        circle1.changeColor("red");//圆变为红色
 */
        //练习1-5：尝试在调用changeColor时指定一个系统无法识别的颜色
/*        circle1.changeColor("blackred");//圆变为黑色
 */
        //练习1-6：试试调用changeColor方法输入颜色时不加前后双引号会发生什么
/*        circle1.changeColor(yellow);//会 编译错误
 */
        //练习1-7：创建一个黄色大圆、一个绿色小圆
/*        circle1.changeColor("yellow");
        circle1.changeSize(60);
        circle1.moveHorizontal(100);
        Circle circle2 = new Circle();
        circle2.changeColor("green");
        circle2.changeSize(30); 
        circle2.moveHorizontal(-100);
        circle2.makeVisible();
 */       
        //练习1-8：检查对象状态
        //练习1-9：画一座房子和一个太阳
/*        circle1.changeColor("red");
        circle1.moveHorizontal(120);
        circle1.moveVertical(-80);
        circle1.changeSize(80);
        
        square1.makeVisible();
        square1.moveHorizontal(-150);
        square1.changeSize(150);
        square1.changeColor("black");
        
        Triangle triangle1 = new Triangle();
        triangle1.makeVisible();
        triangle1.changeColor("yellow");
        triangle1.changeSize(75, 200);
        triangle1.moveHorizontal(25);
        triangle1.moveVertical(-95);           //至此，房子加太阳已画好
 */       
        //练习1-13：太阳是蓝色的
        /*修改Picture中draw（）的源码*/
        Picture picture = new Picture();
        picture.draw();             //太阳已变为蓝色
        //练习1-14：两个太阳
        /*修改Picture中的源码*/     //将修改部分移除，列于下方
/*        Circle sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(-150);
        sun2.moveVertical(-40);
        sun2.changeSize(80);
        sun2.makeVisible();
*/
        //练习1-15：设计日落类
        //练习1-16：日落
        picture.sunSet(200);//蓝色的太阳缓缓落下
        
    }
}
