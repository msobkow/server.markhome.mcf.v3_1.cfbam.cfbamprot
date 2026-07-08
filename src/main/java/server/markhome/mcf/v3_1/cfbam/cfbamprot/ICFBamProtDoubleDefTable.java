
// Description: Java 25 protlic DbIO interface for DoubleDef.

/*
 *	server.markhome.mcf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.mcf.v3_1.cfbam.cfbamprot;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfbam.cfbampub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbampubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbamprotobj.*;

/*
 *	CFBamProtDoubleDefTable protlic database interface for DoubleDef has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFBamProtDoubleDefTable
extends ICFBamProtAtomTable,
	ICFBamPubDoubleDefTable
{
	public static final String TABLE_NAME = "DoubleDef";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtDoubleDef protcreateDoubleDef( ICFSecProtAuthorization Authorization,
		ICFBamProtDoubleDef rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtDoubleDef protcreateDoubleDef( ICFSecProtAuthorization Authorization,
		ICFBamPubDoubleDef rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtDoubleDef protupdateDoubleDef( ICFSecProtAuthorization Authorization,
		ICFBamProtDoubleDef rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtDoubleDef protupdateDoubleDef( ICFSecProtAuthorization Authorization,
		ICFBamPubDoubleDef rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteDoubleDef( ICFSecProtAuthorization Authorization,
		ICFBamProtDoubleDef rec );
	/**
	 *	Delete the DoubleDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteDoubleDefByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleDef key attribute of the instance generating the id.
	 */
	public void protdeleteDoubleDefByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the DoubleDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByUNameIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 */
	public void protdeleteDoubleDefByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId );

	/**
	 *	Delete the DoubleDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByScopeIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 */
	public void protdeleteDoubleDefByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the DoubleDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 */
	public void protdeleteDoubleDefByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the DoubleDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByPrevIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 */
	public void protdeleteDoubleDefByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the DoubleDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByNextIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 */
	public void protdeleteDoubleDefByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the DoubleDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContPrevIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 */
	public void protdeleteDoubleDefByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the DoubleDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContNextIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteDoubleDef( ICFSecProtAuthorization Authorization,
		ICFBamPubDoubleDef rec );
	/**
	 *	Delete the DoubleDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteDoubleDefByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the DoubleDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteDoubleDefByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );


	/**
	 *	Read the derived DoubleDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtDoubleDef protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Read the derived DoubleDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubDoubleDef pubreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the derived DoubleDef record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtDoubleDef protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Lock the derived DoubleDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtDoubleDef protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Lock the derived DoubleDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubDoubleDef publockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the derived DoubleDef record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtDoubleDef protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Read all DoubleDef instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ICFBamProtDoubleDef[] protreadProtAllDerived( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the derived DoubleDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtDoubleDef protreadDerivedByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the derived DoubleDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtDoubleDef protreadDerivedByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived DoubleDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtDoubleDef[] protreadDerivedByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived DoubleDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtDoubleDef[] protreadDerivedByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived DoubleDef record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtDoubleDef[] protreadDerivedByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived DoubleDef record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtDoubleDef[] protreadDerivedByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived DoubleDef record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtDoubleDef[] protreadDerivedByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived DoubleDef record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtDoubleDef[] protreadDerivedByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read the specific DoubleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific DoubleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific DoubleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubDoubleDef pubreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific DoubleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific DoubleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubDoubleDef publockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific DoubleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all the specific DoubleDef record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific DoubleDef instances in the database accessible for the Authorization.
	 */
	public ICFBamProtDoubleDef[] protreadAllRec( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the specific DoubleDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef protreadRecByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the specific DoubleDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef protreadRecByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific DoubleDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef[] protreadRecByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific DoubleDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef[] protreadRecByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific DoubleDef record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef[] protreadRecByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific DoubleDef record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef[] protreadRecByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific DoubleDef record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef[] protreadRecByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific DoubleDef record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDef[] protreadRecByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtDoubleDef protmoveRecUp( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtDoubleDef protmoveRecDown( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );
}
