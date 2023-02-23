// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();
  $('#usuarios').DataTable();
  actualizarEmailDelUsuario();
});
function actualizarEmailDelUsuario(){
 document.getElementById('txt-email-usuario').outerHTML=localStorage.email;
}
async function cargarUsuarios(){
  const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: getHeaders()
  });
  const usuarios = await request.json();

  let listadohtml = '';
    for (let usuario of usuarios){
    let botonEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
      let telefonotexto = usuario.telefono == null ? '-' : usuario.telefono;
    let usuarioHtml = '<tr><td>'+usuario.id+'</td><td>'+usuario.nombre+' '+usuario.apellido+'</td><td>'+usuario.email+'</td><td>'+telefonotexto+'</td><td>'+botonEliminar+'</td></tr>';
    listadohtml+=usuarioHtml;
    }
  console.log(usuarios);

  document.querySelector('#usuarios tbody').outerHTML=listadohtml;
}
function getHeaders(){
    return  {
                 'Accept': 'application/json',
                 'Content-Type': 'application/json',
                 'Authorization': localStorage.token
               };
}
async function eliminarUsuario(id){
if(!confirm('¿Desea eliminar a este usuario?')){
    return;
}
  const request = await fetch('api/eliminar/'+id, {
    method: 'DELETE',
    headers: getHeaders()
  });
    location.reload();
}