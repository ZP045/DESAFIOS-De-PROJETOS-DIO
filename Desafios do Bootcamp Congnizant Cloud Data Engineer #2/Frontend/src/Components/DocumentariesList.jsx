import { useEffect, useState } de 'reagir';

const ListaDocumentarios = () => {

    const [documentarios, setDocumentaries] = useState([])
    
    useEffect(assíncrono () => {
        const url = "http://localhost:/";
        const res = espera buscar(url);
        setDocumentaries(aguarda res.json());
    }, [])
    
    Retorna(
            <table className="striped">
                <thead>
                <tr>
                    <th>Nome</th>
                    <th>Dica</th>
                    <th>Episódios</th>
                    <th>Episódio atual</th>
                    <th>Visto por último</th>
                </tr>
                </thead>

                <tbody>
                {documentarios.map(documentarios => {
                    let type = documentaries.type === 0 ? 'Documentários';
                    let formatDate = (documentaries.last_view).split('T', 1)

                    Retorna(
                        <tr key={documentaries.id}>
                            <td>{documentaries.name}</td>
                            <td>{type}</td>
                            <td>{documentaries.total_ep}</td>
                            <td>{documentaries.atual_ep}</td>
                            <td>{formatDate}</td>
                        </tr>
                    )
                })}
                </tbody>
            </table>
    )
}

exportar MovieList padrão;
