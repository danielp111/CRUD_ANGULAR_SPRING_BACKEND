package soap_corba.NotificacionesPackage;

/**
* soap_corba/NotificacionesPackage/clienteDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from operaciones.idl
* mi�rcoles 9 de diciembre de 2020 12:12:31 AM COT
*/

public final class clienteDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public soap_corba.NotificacionesPackage.clienteDTO value = null;

  public clienteDTOHolder ()
  {
  }

  public clienteDTOHolder (soap_corba.NotificacionesPackage.clienteDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = soap_corba.NotificacionesPackage.clienteDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    soap_corba.NotificacionesPackage.clienteDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return soap_corba.NotificacionesPackage.clienteDTOHelper.type ();
  }

}
