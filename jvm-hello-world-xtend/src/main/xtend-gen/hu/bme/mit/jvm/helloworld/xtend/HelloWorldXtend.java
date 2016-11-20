package hu.bme.mit.jvm.helloworld.xtend;

import hu.bme.mit.jvm.helloworld.HelloWorld;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HelloWorldXtend extends HelloWorld {
  @Override
  public String getResult() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello world");
    return _builder.toString();
  }
}
