package io.cloudslang.lang.compiler.modeller.transformers;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by keke on 3/26/16.
 */
@Component
public class Javascript_ScriptTransformer implements Transformer<String, String>{
  @Override
  public String transform(String rawData) {
    return rawData;
  }

  @Override
  public List<Scope> getScopes() {
    return Arrays.asList(Scope.ACTION);
  }

  @Override
  public String keyToTransform() {
    return null;
  }
}
