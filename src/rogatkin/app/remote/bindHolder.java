package rogatkin.app.remote;

/**
* rogatkin/app/remote/bindHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idl/remotecontext.idl
* Wednesday, February 21, 2018 12:25:09 PM PST
*/

public final class bindHolder implements org.omg.CORBA.portable.Streamable
{
  public rogatkin.app.remote.bind value = null;

  public bindHolder ()
  {
  }

  public bindHolder (rogatkin.app.remote.bind initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = rogatkin.app.remote.bindHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    rogatkin.app.remote.bindHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return rogatkin.app.remote.bindHelper.type ();
  }

}
