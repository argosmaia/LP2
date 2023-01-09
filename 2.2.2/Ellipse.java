import java.awt.*;

public class Ellipse {
  public static void main(String[] args) {
    int a, b;
    int largura, altura;
    Color backgroundColor, borderColor;
  }
   public Ellipse(int a, int b, int largura, int altura, Color border, Color background){
        this.a = b;
        this.b = b;
        this.largura = largura;
        this.altura = altura;
        this.backgroundColor = background;
        this.borderColor = border;
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new backgroundColor(100, 100, 100));
        g2d.fillOval(this.a,this.b, this.largura, this.altura);
        g2d.setColor(borderColor);
        g2d.drawOval(this.a, this.b, this.largura, this.altura);

        g2d.setColor(new backgroundColor(140 190, 90));
        g2d.fillOval(this.a,this.b, this.largura, this.altura);
        g2d.setColor(new borderColor(0,0,155));
        g2d.drawOval(this.a, this.b, this.largura, this.altura);

        g2d.setColor(new backgroundColor(0,100, 200));
        g2d.fillOval(this.a,this.b, this.largura, this.altura);
        g2d.setColor(new borderColor(50,30,90));
        g2d.drawOval(this.a, this.b, this.largura, this.altura);
    }

    public void drag(int x, int y){
        this.a = this.a+x;
        this.b = this.b+y;
    }

    public void changeColor(Color border, Color background){
        this.backgroundColor = background;
        this.borderColor = border;
    }

  }
}
