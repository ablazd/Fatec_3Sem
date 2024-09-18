const person = {
    id: 1,
    name: "Joao",
    age: 17
};

// function printAge(objPerson){
//     console.log(objPerson.age);
// };

// const printAge = (objPerson) => {
//     const {age, name, id} = objPerson;
//     console.log(id, name, age);
// };

// printAge(person);

const people = [
    {
        id: 2,
        name: "Ana",
        age: 17,
        salary: 1500
    },
    {
        id: 2,
        name: "Julia",
        age: 25,
        salary: 4500
    },
    {
        id: 3,
        name: "Victor",
        age: 12,
        salary: 3000
    }
];

//console.log(people);

// const getById = (people, id) => {
//     const person = people.find((p) => p.id === id);
//     return person;
// };
                                    //find retorna apenas um elemento, filter retorna um array c multiplos elementos
// const getById = (people, id) => people.find((p) => p.id === id); //delarou a função, localiza a pessoa e retorna

// const objPerson = getById(people, 2);//recebe o objeto
                                    //stringfy pega um objeto JSON e retorna em string padrão

// const getById = (people = [], id=0) => {
//     return people.filter((p) => p.id === id);
// };

// const foundPeople = getById(people, 2);

// console.log(`Objeto retornado: ${JSON.stringify(foundPeople)}`);//retorna o objeto


// const getOlderThan16 = (people = []) => {
//     return people.filter((p) => p.age >= 16);
// };

// const olderThan16 = getOlderThan16(people);

// console.log(`People older than 16: ${JSON.stringify(olderThan16)}`);//retorna o objeto

// const recalcSalary = (people = []) => {
//     return people.map(({id, name, age, salary}) => ({
//         id,
//         name,
//         age,
//         salary: salary*1.05
//     }));
// };


// const recalcSalary = (people = []) => {
//     return people.map(({person}) => ({
//         ...person, //extrai todas as propriedades
//         salary: person.salary*1.05
//     }));
// };

// const peopleWithNewSalary = recalcSalary(people);

// console.log(`Salary reajusted: ${JSON.stringify(peopleWithNewSalary)}`);


