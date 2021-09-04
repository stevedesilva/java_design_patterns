package silvade.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DecoratorTest {
    @Test
    public void shouldAddTinsel(){
        Assertions.assertEquals("plain tree with tinsel", new TinselDecorator(new TreeImpl()).decorator());
    }
    @Test
    public void shouldAddTinselAndAnAngel(){
        Assertions.assertEquals("plain tree with tinsel with angel", new AngelDecorator(new TinselDecorator(new TreeImpl())).decorator());
    }
    @Test
    public void shouldAddTinselAndAnAngelAndLights(){
        Assertions.assertEquals("plain tree with tinsel with angel with lights", new LightsDecorator(new AngelDecorator(new TinselDecorator(new TreeImpl()))).decorator());
    }
}