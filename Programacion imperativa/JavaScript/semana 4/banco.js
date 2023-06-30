//         lista de clientes.
let arrayCuentas = [
    {
    nroCuenta: 5486273622,
    tipoDeCuenta: "Cuenta Corriente",
    saldoEnPesos: 27771,
    titularCuenta: "Abigael Natte",
    },
    {
    nroCuenta: 1183971869,
    tipoDeCuenta: "Caja de Ahorro",
    saldoEnPesos: 10000,
    titularCuenta: "Ramon Connell",
    },
    {
    nroCuenta: 9582019689,
    tipoDeCuenta: "Caja de Ahorro",
    saldoEnPesos: 27363,
    titularCuenta: "Jarret Lafuente",
    },
    {
    nroCuenta: 1761924656,
    tipoDeCuenta: "Cuenta Corriente",
    saldoEnPesos: 32415,
    titularCuenta: "Ansel Ardley",
    },
    {
    nroCuenta: 7401971607,
    tipoDeCuenta: "Cuenta Unica",
    saldoEnPesos: 18789,
    titularCuenta: "Jacki Shurmer",
    },
];
//      ignorar()
function mensaje (msj){
    console.log("\n-------------------------------------------------------------------------------");
    console.log(msj);
    console.log("-------------------------------------------------------------------------------\n");
}


//         banco

let banco = {
    clientes : arrayCuentas,
    consultarCliente : function (titular){
        for(let i = 0; i <= arrayCuentas.length ; i++){
            if (this.clientes[i].titularCuenta == titular){
                return (arrayCuentas[i]);
            }
        }
    },
    deposito : function (titular,dinero_a_depositar){
        this.consultarCliente(titular).saldoEnPesos += dinero_a_depositar
        mensaje('Depósito realizado, su nuevo saldo es: ' + this.consultarCliente(titular).saldoEnPesos)
    },
    extraccion : function(titular,dinero_a_extraer){
        let chequeo_fondos = this.consultarCliente(titular)
        if((chequeo_fondos.saldoEnPesos - dinero_a_extraer)< 0){
            mensaje('\tFondos insuficientes')
        }
        else{
            chequeo_fondos.saldoEnPesos -= dinero_a_extraer
            mensaje('Extracción realizada correctamente, su nuevo saldo es: $' + chequeo_fondos.saldoEnPesos)
        }
    }
}


//          resultados zone

/* console.log(banco); */

banco.deposito('Ramon Connell', 1000)

banco.extraccion('Ramon Connell', 50000)

console.log('\n\t\tDatos del Titular Buscado\n',banco.consultarCliente('Ramon Connell'));
