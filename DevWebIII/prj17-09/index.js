const person = {
    id: 1,
    name: "João",
    age: 17,
};

function printAge(objPerson) {
    console.log(objPerson.age);
};

const printAge2 = (objPerson) => {
    const { age, name, id } = objPerson;
    console.log(id, name, age);
};

const printAge3 = ({ age, name, id }) => {
    console.log(id, name, age);
};

// printAge3(person);

const people = [
    {
        id: 1,
        name: "João",
        age: 17,
        salary: 2000,
    },
    {
        id: 2,
        name: "Pedro",
        age: 25,
        salary: 1500,
    },
    {
        id: 3,
        name: "Maria",
        age: 12,
        salary: 3000,
    },

];

// console.log(people)

// const getById = (people, id) => {
//     const person = people.find((p) => p.id === id);
//     return person;
// };

// const getById = (people, id) => people.find((p) => p.id === id);

const getByIds = (people = [], id = 0) => {
    return people.filter((p) => p.id === id);
};

console.log(`Objeto retornado: ${JSON.stringify(getByIds(people, 2))}`);

const getOlderThan16 = (people = []) => {
    return people.filter((p) => p.age >= 16)
};

console.log(`People older than 16 ${JSON.stringify(getOlderThan16(people))}`);

const salaryBonus = (people = []) => {
    return newSalary = people.map((person) => ({
        id: person.id,
        name: person.name,
        age: person.age,
        salary: person.salary * 1.05,
    })
    );
};

const salaryBonus2 = (people = []) => {
    return newSalary = people.map(({ id, name, age, salary }) => ({
        id, //se a variavel tem o msm nome do atributo nao precisa repetir exemplo "id: id" == "id"
        name,
        age,
        salary: salary * 1.05,
    })
    );
};

const salaryBonus3 = (people = []) => {
    return newSalary = people.map((person) => ({
        ...person, //ele mantem todos atributos anteriores
        salary: person.salary * 1.05, //apos isso vc faz uma reatribuicao
    })
    );
};

const peopleNewSalary = salaryBonus3(people);

console.log(`People with salary reajusted ${JSON.stringify(peopleNewSalary)}`);

const sumSalaries = (people=[]) => {
    //array.reduce((acumulador, objeto) => acumulador + salario do objeto atual, valor inicial)
    return people.reduce((acc, person) => acc + person.salary, 0);
};

console.log(`Total ${sumSalaries(peopleNewSalary)}`);

peopleNewSalary.forEach(person => {
    console.log(person);
});

peopleNewSalary.forEach(({ id, name, age, salary }) => {
    console.log(`Person ID: ${id}, Name: ${name} has a new salary of ${salary} at age ${age}`);
});

