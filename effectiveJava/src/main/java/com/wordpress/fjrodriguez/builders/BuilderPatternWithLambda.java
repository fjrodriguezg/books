package com.wordpress.fjrodriguez.builders;

import java.util.function.Consumer;

/**
 * https://medium.com/beingprofessional/think-functional-advanced-builder-pattern-using-lambda-284714b85ed5
 */

public class BuilderPatternWithLambda {

    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public static class Builder {
        private int servingSize;
        private int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder with(final Consumer<Builder> builderFunction) {
            builderFunction.accept(this);
            return this;
        }

        public BuilderPatternWithLambda createBuilderPatternWithLambda() {
            final BuilderPatternWithLambda builderPatternWithLambda = new BuilderPatternWithLambda();
            builderPatternWithLambda.servingSize = servingSize;
            builderPatternWithLambda.servings = servings;
            builderPatternWithLambda.calories = calories;
            builderPatternWithLambda.fat = fat;
            builderPatternWithLambda.sodium = sodium;
            builderPatternWithLambda.carbohydrate = carbohydrate;
            return builderPatternWithLambda;
        }
    }

    public static void main(String[] args) {
        new Builder()
                .with(personBuilder -> {
                    personBuilder.servingSize = 240;
                    personBuilder.servings = 8;
                    personBuilder.calories = 100;
                    personBuilder.sodium = 35;
                    personBuilder.carbohydrate = 27;
                }).createBuilderPatternWithLambda();
    }
}
