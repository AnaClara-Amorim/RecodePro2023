import React, {useState} from 'react'
import './App.css'

function App() {
  // ESTADOS - VARIAVEIS
  const [contador, setContador] = useState(0)
  const [nome, setNome] = useState('')
  // FUNÇÃO PARA INCRIMENTAR O ESTADO CONTADOR

  const incrementar = () => {
     setContador(contador + 1)
  }

 

  // FUNÇÃO QUE CONTROLA O VALOR DO INPUT E DO ESTADO NOME
  function mudarTexto(event){
    setNome(event.target.value)
  }

   return (
    <div className="App">

      <input type='text' value={nome} onChange={mudarTexto} />
      <button onClick={incrementar}>Click </button>
      <p>Numeros de cliques: {contador}</p><br></br>
      <p>{nome}</p>    
    </div>
  );
}
export default App;

 