function checkEmailComputacao(email) {
    const pattern = /@ccc.ufcg.edu.br/;
    return pattern.test(email);
}

export { checkEmailComputacao } ;