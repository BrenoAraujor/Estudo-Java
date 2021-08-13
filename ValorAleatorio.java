public class ValorAleatorio {
    public static void main(String[]args){

        // Estou testando a biblioteca "Math"
       // Math sgnifica: Matemática     Random:  Aleatório

       // O código foi criado para gerar um valor aleatório
       // Nesse programa foi criando duas variáves um tipo "double" e int, dois tipos primitivos
     double alea = Math.random();  //Nessa linha foi criando a variável e colocado à função "Math.random();". Vai ser o responsável por "escolhe um número".
     int  n = (int) (50    + alea * (20 - 50));  // Aqui está o local onde vai acontecer a "mágia". Como pode ver esse é o local do calculo e váriavel "alea" está como o gerenciador e ele irá determinar o valor que irá ser escolhindo. Na linha existe essa conta "(10  + alea*(1-10))."
     // Para que possa escolhe um valor é determinado um um limite de escolha. No caso do código o valor é (1 - 10), então irá escolhe um valor entre 1 e 10.
    //  Caso queria mudar o valor, exemplo: para que escolha um número aleatório entre 20 a 50 é só modificar o código assim (50 + alea * (20 - 50));
        System.out.print(n);

    }
}
