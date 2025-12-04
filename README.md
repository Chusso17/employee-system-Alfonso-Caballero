# Employee System

## UML

- El UML es simple; la superclase principal es employee que es abstracta. Implementa la interfaz evaluable.

- La superclase contiene los atributos name y salary; y contiene dos atributos abstractos: work y calculateAnnualBonus y otro concreto details

- Hay 3 subclases: Developer, Manager, Designer que heredan de Employee

## Código

- La carpeta de src contiene un proyecto de intelliJ, en el src del proyecto hay dos paquetes, clases y main

- En el main; contiene una mutableList con tres employees; un developer, un designer y un manager. Despues un bucle forEach con las cuatro funciones que puede hacer un employee. Se puede modificar como se desee

- En el paquete de clases; en las tres subclases hay un setter personalizado para salary que si el salary con el que se inicializa un employee es negativo, se establece en 0.00
