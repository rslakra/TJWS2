// ErrorBox - an error-box
//
// Copyright (C) 1996 by Jef Poskanzer <jef@mail.acme.com>. All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above copyright
// notice, this list of conditions and the following disclaimer in the
// documentation and/or other materials provided with the distribution.
//
// THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND
// ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
// FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
// OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
// HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
// LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
// OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE.
//
// Visit the ACME Labs Java page for up-to-date versions of this and other
// fine Java utilities: http://www.acme.com/java/

package Acme.Widgets;

import java.awt.Frame;

/// An error-box.
// <P>
// Puts up a dialog with an error icon, a specified message, and an Ok
// button. All user input is locked out until the button is clicked.
// <P>
// Sample usage:
// <IMG ALIGN=RIGHT WIDTH=150 HEIGHT=64 SRC="ErrorBox.gif">
// <BLOCKQUOTE><PRE><CODE>
// ErrorBox e = new ErrorBox( this, "Sample ErrorBox" );
// e.show();
// </CODE></PRE></BLOCKQUOTE>
// <P>
// <A HREF="/resources/classes/Acme/Widgets/ErrorBox.java">Fetch the
/// software.</A><BR>
// <A HREF="/resources/classes/Acme.tar.gz">Fetch the entire Acme package.</A>

public class ErrorBox extends OkDialog {
	
	/// Constructor, default title.
	public ErrorBox(Frame parent, String message) {
		this(parent, "Error", message);
	}
	
	/// Constructor, specified title.
	public ErrorBox(Frame parent, String title, String message) {
		super(parent, title, Acme.GuiUtils.errorIcon(parent), message);
		setBackground(Acme.GuiUtils.errorColor);
	}
	
}
