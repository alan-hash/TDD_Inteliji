import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_create_coche_velocidad_cero(){
        Coche nuevoCoche=new Coche();
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
    @Test
    public void acelerar_coche_aumentaV(){
        Coche nuevoCoche=new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void decelerar_coche_disminuyeV(){
        Coche nuevoCoche=new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }

    @Test
    public void decelerar_coche_no_puede_ser_menor_que_cero(){
        Coche nuevoCoche=new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar(80);
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
}
