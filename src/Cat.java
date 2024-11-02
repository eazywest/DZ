public class Cat extends Animals {

    @Override
    public String doing(){
        return ("Рвет обои");
    }

    @Override
    public String Action(){
        if(anwesr.equalsIgnoreCase("Да" ) || anwesr.equalsIgnoreCase("я принес"))
            return ("Я люблю тебя хозяин\n" + "⎛⎝ ≽ > ⩊ < ≼ ⎠⎞");
        else {
            return ("Я ненавижу тебя хозяин\n" + "( ｡ •̀ ᴖ •́ ｡)\n" );

        }
    }
}
