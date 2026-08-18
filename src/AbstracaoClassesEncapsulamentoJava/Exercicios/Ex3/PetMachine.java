package AbstracaoClassesEncapsulamentoJava.Exercicios.Ex3;

public class PetMachine {
    private double waterLevel;
    private double shampooLevel;
    private boolean hasPet;
    private boolean isClean;
    private Pet pet;

    public PetMachine(){
        waterLevel = 0;
        shampooLevel = 0;
        hasPet = false;
        isClean = true;
        pet = null;
    }

    public double getWaterLevel(){
        return waterLevel;
    }

    public double getShampooLevel(){
        return shampooLevel;
    }

    public boolean getHasPet(){
        return hasPet;
    }

    public boolean isClean(){
        return isClean;
    }

    public void toBathe(){
        if(waterLevel < 10 && shampooLevel < 2 || !hasPet){
            System.out.println("Não foi possível realizar o banho, verifique se a máquina está abastecida, e/ou se há pet na máquina.");
            return;
        }
            waterLevel -= 3;
            shampooLevel -= 1;
            pet.setIsClean(true);
            System.out.println("O banho foi realizado com sucesso.");
    }

    public void supplyWater(double water) {
        if (water > 3) {
            System.out.println("A máquina suporta abastecer no máximo 3L por vez.");
            return;
        }
        if (waterLevel + water > 30) {
            System.out.printf("A quantidade de %.1fL de água excederá o limite de 30L tente outro valor.\n", water);
            return;
        }
        waterLevel += water;
        System.out.printf("A máquina foi abastecida com %.1fL de água\n", water);

    }
    public void supplyShampoo(double shampoo) {
        if (shampoo > 1) {
            System.out.println("A máquina suporta abastecer no máximo 1L por vez.");
            return;
        }
        if (shampooLevel + shampoo > 10) {
            System.out.printf("A quantidade de %.1fL de shampoo excederá o limite de 10L tente outro valor.\n", shampoo);
            return;
        }
        shampooLevel += shampoo;
        System.out.printf("A máquina foi abastecida com %.1fL de água\n", shampoo);
    }

    public void putPetInPetMachine(Pet pet){
        if (hasPet){
            System.out.println("Já há um Pet na máquina.");
            return;
        }
        if (!isClean){
            return;
        }
        this.pet = pet;
        hasPet = true;
        System.out.printf("o pet %s foi colocado na máquina.\n", pet.getName());
    }

    public void removePetInPetMachine(){
        if (!hasPet){
            System.out.println("Não há nenhum Pet na máquina.");
            return;
        }
            hasPet = false;
            if (!pet.getIsClean()){
                isClean = false;
                System.out.println("O pet saiu da máquina sem estar limpo, será necessário limpar a máquina");
            }
            System.out.printf("O pet %s saiu da máquina.\n", pet.getName());
            pet = null;
    }

    public void cleanMachine() {
        if (!isClean) {
            if (waterLevel < 3 && shampooLevel < 1) {
                System.out.println("Não foi possível limpar a máquina, abasteça com água ou shampoo.");
                return;
            }
            waterLevel -= 3;
            shampooLevel -= 1;
            System.out.println("Limpeza da máquina foi realizada com sucesso.");
            isClean = true;
            return;
        }
        System.out.println("A máquina ja está limpa.");
    }
}
