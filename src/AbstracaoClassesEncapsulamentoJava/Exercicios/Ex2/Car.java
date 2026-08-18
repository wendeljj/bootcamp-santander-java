package AbstracaoClassesEncapsulamentoJava.Exercicios.Ex2;

public class Car {
    private boolean isOn;
    private int speed;
    private int march;

    public Car(){
        this.isOn = false;
        this.speed = 0;
        this.march = 0;
    }

    public boolean getIsOn(){
        return isOn;
    }

    public int getSpeed(){
        return speed;
    }

    public void setOn(){
        if (isOn){
            System.out.println("O carro já está ligado.");
            return;
        }
        isOn = true;
        System.out.println("O carro foi ligado com sucesso.");
    }

    public void setOff(){
        if (isOn){
            if (march == 0 && speed == 0){
                isOn = false;
                System.out.println("O carro foi desligado com sucesso.");
                return;
            }
            System.out.println("O carro não pode ser desligado, enquanto nao estiver no ponto morto.");
        }
        System.out.println("O carro já está desligado.");
    }

    public void pushMarch(){
        if (isOn){
            switch (march){
                case 0 -> {
                    march++;
                    System.out.println("Subiu para marcha 1 com sucesso.");
                }
                case 1 ->{
                    if (speed == 20){
                        march++;
                        speed++;
                        System.out.println("Subiu para marcha 2 com sucesso.");
                        return;
                    }
                        System.out.println("Não foi possivel subir para 2 marcha.");
                }
                case 2 ->{
                    if (speed == 40){
                        march++;
                        speed++;
                        System.out.println("Subiu para marcha 3 com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel subir para 3 marcha.");
                }
                case 3 ->{
                    if (speed == 60){
                        march++;
                        speed++;
                        System.out.println("Subiu para marcha 4 com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel subir para 4 marcha.");
                }
                case 4 ->{
                    if (speed == 80){
                        march++;
                        speed++;
                        System.out.println("Subiu para marcha 5 com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel subir para 5 marcha.");
                }
                case 5 ->{
                    if (speed == 100){
                        march++;
                        speed++;
                        System.out.println("Subiu para marcha 6 com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel subir para 6 marcha.");
                }
                default -> System.out.println("Não foi possível subir de marcha.");
            }
        }
    }

    public void downMarch(){
        if (isOn){
            switch (march){
                case 1 ->{
                    if (speed == 0){
                        march--;
                        System.out.println("Desceu para o ponto morto com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel descer para o ponto morto");
                }
                case 2 ->{
                    if (speed == 21){
                        march--;
                        speed--;
                        System.out.println("Desceu para marcha 1 com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel descer para 1 marcha.");
                }
                case 3 ->{
                    if (speed == 41){
                        march--;
                        speed--;
                        System.out.println("Desceu para marcha 2 com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel descer para 2 marcha.");
                }
                case 4 ->{
                    if (speed == 61){
                        march--;
                        speed--;
                        System.out.println("Desceu para marcha 3 com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel descer para 3 marcha.");
                }
                case 5 ->{
                    if (speed == 81){
                        march--;
                        speed--;
                        System.out.println("Desceu para marcha 4 com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel descer para 4 marcha.");
                }
                case 6 ->{
                    if (speed == 101){
                        march--;
                        speed--;
                        System.out.println("Desceu para marcha 5 com sucesso.");
                        return;
                    }
                    System.out.println("Não foi possivel descer para 5 marcha.");
                }
                default -> System.out.println("Não foi possível descer de marcha.");
            }
        }
    }

    public void accelerate(){
        switch (march){
            case 0 -> System.out.println("Não é possível acelerar enquanto o carro estiver no ponto morto ou desligado.");
            case 1 ->{
                if (speed >= 0 && speed < 20){
                    speed++;
                    System.out.println("O carro aumentou 1km de velocidade.");
                    return;
                }
                System.out.println("Não foi possivel acelerar.");
            }
            case 2 ->{
                if (speed >= 20 && speed < 40){
                    speed++;
                    System.out.println("O carro aumentou 1km de velocidade.");
                    return;
                }
                System.out.println("Não foi possivel acelerar.");;
            }
            case 3 ->{
                if (speed >= 40 && speed < 60){
                    speed++;
                    System.out.println("Subiu para marcha 4 com sucesso.");
                    return;
                }
                System.out.println("Não foi possivel acelerar.");;
            }
            case 4 ->{
                if (speed >= 60 && speed < 80){
                    speed++;
                    System.out.println("Subiu para marcha 5 com sucesso.");
                    return;
                }
                System.out.println("Não foi possivel acelerar.");;
            }
            case 5 ->{
                if (speed >= 80 && speed < 100){
                    speed++;
                    System.out.println("Subiu para marcha 6 com sucesso.");
                    return;
                }
                System.out.println("Não foi possivel acelerar.");
            }
            case 6 ->{
                if (speed >= 100 && speed < 120){
                    speed++;
                    System.out.println("Subiu para marcha 6 com sucesso.");
                    return;
                }
                System.out.println("Não foi possivel acelerar.");;
            }
            default -> System.out.println("Não foi possível acelerar.");
        }
    }

    public void decelerate(){
        switch (march){
            case 0 -> System.out.println("Não é possível desacelerar enquanto o carro estiver no ponto morto ou desligado.");
            case 1 ->{
                if (speed > 0 && speed <= 20){
                    speed--;
                    System.out.println("O carro diminuiu 1km de velocidade.");
                    return;
                }
                System.out.println("Não foi possivel desacelerar.");
            }
            case 2 ->{
                if (speed > 20 && speed <= 40){
                    speed--;
                    System.out.println("O carro diminuiu 1km de velocidade.");
                    return;
                }
                System.out.println("Não foi possivel desacelerar.");
            }
            case 3 ->{
                if (speed > 40 && speed <= 60){
                    speed--;
                    System.out.println("O carro diminuiu 1km de velocidade.");
                    return;
                }
                System.out.println("Não foi possivel desacelerar.");
            }
            case 4 ->{
                if (speed > 60 && speed <= 80){
                    speed--;
                    System.out.println("O carro diminuiu 1km de velocidade.");
                    return;
                }
                System.out.println("Não foi possivel desacelerar.");;
            }
            case 5 ->{
                if (speed > 80 && speed <= 100){
                    speed--;
                    System.out.println("O carro diminuiu 1km de velocidade.");
                    return;
                }
                System.out.println("Não foi possivel desacelerar.");;
            }
            case 6 ->{
                if (speed > 100 && speed <= 120){
                    speed--;
                    System.out.println("O carro diminuiu 1km de velocidade.");
                    return;
                }
                System.out.println("Não foi possivel desacelerar.");;
            }
            default -> System.out.println("Não foi possível desacelerar.");
        }
    }

    public void turnLeft(){
        if (speed >= 1 && speed <= 40) {
            System.out.println("O carro virou para esquerda.");
            return;
        }
        System.out.println("Não é possível virar para a esquerda.");
    }

    public void turnRight(){
        if (speed >= 1 && speed <= 40) {
            System.out.println("O carro virou para direita.");
            return;
        }
        System.out.println("Não é possível virar para a direita.");
    }

}
